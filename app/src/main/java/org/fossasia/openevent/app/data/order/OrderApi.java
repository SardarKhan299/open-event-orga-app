package org.fossasia.openevent.app.data.order;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface OrderApi {

    @GET("events/{id}/orders?include=event&fields[event]=id&page[size]=0")
    Observable<List<Order>> getOrders(@Path("id") long id);
}
