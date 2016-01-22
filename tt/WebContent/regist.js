
/**
		 * 绑定发送验证码按钮事件, 请求服务端发送手机验证码
		 * 点击后, 限定点击按钮, 60S后可重新发送
		 */
		$("#sendMsg").click(function(){
			formValidator.cellphone.status = 1;
			$("#phoneMsg").html(""); // 清空提示
			var phone = $.trim($("#cellphone").val()); // 获得手机号码, 并去空
			$("#cellphone").val(phone); 
			// 非空
			if (phone == null || phone == "") {
				$("#phoneMsg").html("请输入手机号码.");
				formValidator.cellphone.status = 2;
				return ;
			}
			// 正确的手机格式
			if (!reg_phone.test(phone)) {
				$("#phoneMsg").html("请输入正确的手机号码.");
				formValidator.cellphone.status = 2;
				return ;
			}
			// 取消按钮操作.
			$("#sendMsg").attr({"disabled":"disabled"}); 
			$("#sendMsg").val("正在发送.");
			// ajax请求验证
			$.ajax({
				url : basePath + "userValidPhone",
				type: "post",
				data:{"phone": phone}, 
				dataType : "json",
				success : function(data) {
					if (data.success) {
						// 发送成功, 按钮禁用, 60秒后开启
						$("#phoneMsg").html("短信已发送, 请注意接收."); 
						formValidator.cellphone.status = 3;
					} else {
						// 失败, 显示错误信息
						$("#phoneMsg").html(data.msg);
						formValidator.cellphone.status = 2;
					}
					$("#sendMsg").val('60s后可再发送');
					var start = new Date().getTime();
					var end = start + 1000 * 60;
					var intervalID = window.setInterval(function() {
						var now = new Date().getTime();
						var time = parseInt((end - now) / 1000); 
						$("#sendMsg").val(time + 's后可再发送');
					}, 1000);
					window.setTimeout(function() {
						window.clearInterval(intervalID);
						$('#sendMsg').removeAttr('disabled');
						$('#sendMsg').val("发送验证码");
					}, 1000 * 60);
				}
			});
		});
		
		/**
		 * 绑定验证码框的焦点失去事件, 检查输入的验证码是否正确
		 */
		$("#phoneCode").blur(function() {
			formValidator.phoneCode.status = 1;
			var phoneCode = $.trim($("#phoneCode").val()); // 获得手机号码, 并去空
			$("#phoneCode").val(phoneCode); 
			if (phoneCode == "" || phoneCode == null) {
				$("#phoneCode").next().html("请输入正确的验证码");
				formValidator.phoneCode.status = 2;
				return ;
			}
			$.ajax({
				url  : basePath + "userValidPhoneCode",
				data : {"phoneCode" : phoneCode},
				dataType : "json",
				type : "post",
				success : function(data) {
					if (data.success) {
						$("#phoneCode").next().html(""); 
						formValidator.phoneCode.status = 3;
					} else {
						$("#phoneCode").next().html(data.msg);
						formValidator.phoneCode.status = 2;
					}
				}
			});
		});
		
		/**
		 * Email验证
		 */
		$("#email").blur(function(){
			formValidator.email.status = 1;
			var email = $.trim($("#email").val());
			if (email == null || email == "") {
				$("#email").next().html(" 该选项是必填项.");
				formValidator.email.status = 2;
				return;
			}
			// 格式验证
			if (!reg_email.test(email)) {
				$("#email").next().html("请输入一个正确的邮箱.");
				formValidator.email.status = 2;
				return;
			}
			// 验证邮箱是否被注册过
			$.ajax({
				url : basePath + "userValidEmail",
				type: "post",
				data:{"email": email}, 
				dataType : "json",
				success : function(data) {
					if (data.success) {
						// 验证成功
						$("#email").next().html(""); 
						formValidator.email.status = 3;
					} else {
						// 失败, 显示错误信息
						$("#email").next().html(data.msg);
						formValidator.email.status = 2;
					}
				}
			});
		});
		 
		/**
		 * 密码框验证
		 */
		$("#pwd, #confirmPwd").blur(function(){
			formValidator.pwd.status = 1;
			formValidator.confirmPwd.status = 1;
			// 获取数据
			var pwd = $.trim($("#pwd").val());
			var confirmPwd = $.trim($("#confirmPwd").val());;
			// 验证格式
			if (!reg_pwd.test(pwd)) {
				$("#pwd").next().html("请输入合适的密码.");
				formValidator.pwd.status = 2;
				return ;
			}
			$("#pwd").next().html("");
			// 验证2次密码是否一致
			if (pwd != confirmPwd) {
				$("#confirmPwd").next().html("2次密码必须一致.");
				formValidator.confirmPwd.status = 2;
				return ;
			}
			// 清空所有提示
			$("#confirmPwd").next().html("");
			formValidator.pwd.status = 3;
			formValidator.confirmPwd.status = 3;
		});
		
		// 名称 非空验证
		$("#name").blur(function() {
			formValidator.name.status = 1;
			var name = $.trim($("#name").val());
			if (name == "" || name == null) {
				$("#name").next().html("该项为必填选项.");
				formValidator.name.status = 2;
				return ;
			}
			$("#name").next().html("");
			formValidator.name.status = 3;
		});
		
		/**
		 * 身份证验证
		 */
		 $("#card_id").blur(function() {
			 formValidator.card_id.status = 1;
			 var cardId = $.trim($("#card_id").val());
			 if (!reg_card.test(cardId)) {
				 $("#card_id").next().html("请输入正确的身份证号码!");
				 formValidator.card_id.status = 2;
				 return ;
			 }
			 // 发送ajax请求, 验证身份证是否被注册过
			 $.ajax({
				url : basePath + "userValidCardNo",
				type: "post",
				data:{"cardId": cardId}, 
				dataType : "json",
				success : function(data) {
					if (data.success) {
						// 验证成功
						$("#card_id").next().html(""); 
						formValidator.card_id.status = 3;
					} else {
						// 失败, 显示错误信息
						$("#card_id").next().html(data.msg);
						formValidator.card_id.status = 2;
					}
				}
			});
		 }); 
		
		// ajax上传资格证
		$("#cert_img").change(function() {
			formValidator.cert_img.status = 1;
			var certImg = $("#cert_img").val();
			//alert(certImg);
			$.ajaxFileUpload({
			 	url: basePath+'uploadImg?nowTime=' + new Date().getTime() ,
                secureuri: false,
                fileElementId: 'cert_img',
                dataType: 'json',
                success: function (data, status) {
                	var certImgMsg = $("#cert_img").next();
                	if (data.success) {
                		formValidator.cert_img.status = 3;
                		certImgMsg.css("color","green");
                		//$("#showCertImg").attr("src", basePath + "showImg?nowTime=" + new Date().getTime());
                		certImgMsg.html(data.msg + ", 可进行<a href='${basePath}userRegist/showImg?nowTime=" + new Date().getTime() + "' rel='[gall1]'>预览</a>");
                		$('a[rel]').foxibox();
                	} else {
                		certImgMsg.css("color","red");
                		formValidator.cert_img.status = 2;
                		certImgMsg.html(data.msg);
                	}
               		
                }
			});
		});
		
		/**
		 * 验证企业资格证编码  
		 */
		$("#cert_num").blur(function() {
			formValidator.cert_num.status = 1;
			var certNum = $.trim($("#cert_num").val());
			if (certNum == "" || certNum == null) {
				$("#cert_num").next().html("该项为必填选项.");
				formValidator.cert_num.status = 2;
				return ;
			}
			$("#cert_num").next().html("");
			formValidator.cert_num.status = 3;
		});
		
		$("#registbtn").click(function() {
			console.info("click this regist button...");
			// 禁用提交按钮
			$("#registbtn").attr("disabled","disabled");
			// 验证各项是否已经验证通过
			var intervalId = window.setInterval(function() {
				var rs = validators();
				//alert("rs : " + rs);
				console.info("validate result : " + rs);
				if (rs == 3) {
					//alert("验证通过, 准备提交..");
					window.clearInterval(intervalId);
					$("#cert_img").removeAttr("name");
					$("#registform").submit();
				} else if (rs == 2){
					// 存在验证失败项, 提示失败信息, 取消继续提交
					//alert("验证失败, 提示失败信息..");
					window.clearInterval(intervalId);
					$("#registbtn").removeAttr("disabled");
				} 
			}, 300);
			
			/*
			$("#registform").submit();*/
		});
		
		function validators() {
			for (var ele in formValidator) {
				// 检查状态值: 0 为未进行验证, 1为正在验证, 2验证失败, 3为验证通过
				if (formValidator[ele].status == 0) {
					formValidator[ele]['validatorFn']();
					return 0; // 现在进行验证, 请稍后再次提交
				} else if (formValidator[ele].status == 1) {
					return 1; // 有选项未验证完成, 请稍后再测试
				} else if (formValidator[ele].status == 2) {
					$("html, body").animate({  
			            scrollTop: $("#" + formValidator[ele].elementId).offset().top + "px"  
			        }, {  
			            duration: 300,  
			            easing: "swing"  
			        });
					formValidator[ele].status == 0;
					return 2;
				} 
			}
			return 3;
		}
		