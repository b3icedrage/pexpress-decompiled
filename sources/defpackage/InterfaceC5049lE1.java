package defpackage;

import androidx.lifecycle.LiveData;
import com.jivosite.sdk.model.pojo.config.Config;
import com.jivosite.sdk.model.pojo.history.HistoryResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LlE1;", "", "", "widgetId", "Landroidx/lifecycle/LiveData;", "Ljd;", "Lcom/jivosite/sdk/model/pojo/config/Config;", R51.PUSH_ADDITIONAL_DATA_KEY, "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "clientId", "", "siteId", "Lcom/jivosite/sdk/model/pojo/history/HistoryResult;", "b", "(Ljava/lang/String;JLjava/lang/String;)Landroidx/lifecycle/LiveData;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface InterfaceC5049lE1 {
    @InterfaceC4734jk0("config/{widgetId}")
    @InterfaceC3023bo0({"url:sdk"})
    @NotNull
    LiveData<C4705jd<Config>> a(@InterfaceC0884Ec1("widgetId") @NotNull String widgetId);

    @InterfaceC4734jk0("client/{siteId}/{widgetId}/messages?")
    @InterfaceC3023bo0({"url:node"})
    @NotNull
    LiveData<C4705jd<HistoryResult>> b(@InterfaceC1854Qn0("x-jv-client-id") @NotNull String clientId, @InterfaceC0884Ec1("siteId") long siteId, @InterfaceC0884Ec1("widgetId") @NotNull String widgetId);
}
