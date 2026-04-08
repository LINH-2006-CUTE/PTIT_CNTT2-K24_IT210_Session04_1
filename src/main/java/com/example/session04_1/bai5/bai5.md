- Tầng Controller : nhận Request từ URL (GET, POST, DELETE)

Kiểm tra định dạng dữ liệu đầu vào (ví dụ: bắt lỗi nếu khách nhập chữ vào ô số ID) trước khi chuyển vào bên trong

- Tầng Service :

Xử lý các quy tắc của nhà hàng (ví dụ: tính giảm giá, kiểm tra trạng thái đơn hàng). Đây là "bộ não" điều phối công việc

- Tầng Repository

Chỉ tập trung vào việc Tìm kiếm, Thêm, Sửa, Xóa dữ liệu
