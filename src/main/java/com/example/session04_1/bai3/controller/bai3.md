Cách A: Dùng URL /bai3/orders/5 kết hợp với @PathVariable.
Cách B: Dùng URL /bai3/orders?id=5 kết hợp với @RequestParam.

--> Em chọn cách A vì :
nó xác định đối tượng duy nhất trên nằm trực tiếp trên URL, khi muốn xem đơn hàng (id) 
còn cách B: vị trí của URL nó nằm sau ?  để lọc hoặc tìm kiếm dữ liệu theo id=5, nó là 1 tham số dùng để lọc hoặc tìm kiếm dựa theo đúng key value