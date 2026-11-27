package defpackage;

import androidx.lifecycle.LiveData;
import com.jivosite.sdk.model.pojo.push.Device;
import com.jivosite.sdk.model.pojo.response.Response;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ldl1;", "", "", "clientId", "", "siteId", "widgetPublicId", "Lcom/jivosite/sdk/model/pojo/push/Device;", "body", "Landroidx/lifecycle/LiveData;", "Ljd;", "b", "(Ljava/lang/String;JLjava/lang/String;Lcom/jivosite/sdk/model/pojo/push/Device;)Landroidx/lifecycle/LiveData;", "pushId", "Lcom/jivosite/sdk/model/pojo/response/Response;", R51.PUSH_ADDITIONAL_DATA_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface InterfaceC3432dl1 {
    @InterfaceC3023bo0({"url:push"})
    @InterfaceC2206Va1("push/delivery/{site_id}/{client_id}/{push_id}?platform=android")
    @NotNull
    LiveData<C4705jd<Response>> a(@InterfaceC0884Ec1("site_id") @NotNull String siteId, @InterfaceC0884Ec1("client_id") @NotNull String clientId, @InterfaceC0884Ec1("push_id") @NotNull String pushId);

    @InterfaceC3023bo0({"url:node"})
    @InterfaceC2206Va1("/client/{siteId}/{widgetPublicId}/device")
    @NotNull
    LiveData<C4705jd<Object>> b(@InterfaceC1854Qn0("x-jv-client-id") @NotNull String clientId, @InterfaceC0884Ec1("siteId") long siteId, @InterfaceC0884Ec1("widgetPublicId") @NotNull String widgetPublicId, @InterfaceC5396mt @NotNull Device body);
}
