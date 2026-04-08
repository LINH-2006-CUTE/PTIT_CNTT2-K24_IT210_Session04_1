I/O:

Input: tham số: category (kiểu String) và limit (kiểu Integer)  truyền qua Query Parameters trên URL sau dấu ?

Controller nhận dữ liệu qua RequestParam, dùng model.addAttribute() -> View
sử dụng các Key category, limit, message

Output: Tên file View: productList.jsp được Controller trả về qua chuỗi String "productList"
hiển thị : ${category}: Hiển thị loại món, ${limit}: Hiển thị con số giới hạn, ${message}: Hiển thị thông báo trạng thái

