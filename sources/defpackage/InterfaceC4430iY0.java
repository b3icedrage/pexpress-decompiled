package defpackage;

import androidx.lifecycle.LiveData;
import com.google.android.gms.common.internal.ImagesContract;
import com.jivosite.sdk.model.pojo.media.MediaSignResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LiY0;", "", "", "path", "Landroidx/lifecycle/LiveData;", "Ljd;", "Ljava/lang/Void;", "b", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "fileName", "clientId", "", "siteId", "widgetId", "Lcom/jivosite/sdk/model/pojo/media/MediaSignResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Landroidx/lifecycle/LiveData;", "metadata", ImagesContract.URL, "Lms1;", "body", R51.PUSH_ADDITIONAL_DATA_KEY, "(Ljava/lang/String;Ljava/lang/String;Lms1;)Landroidx/lifecycle/LiveData;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface InterfaceC4430iY0 {
    @InterfaceC2288Wa1
    @NotNull
    LiveData<C4705jd<Void>> a(@InterfaceC1854Qn0("x-metadata") @Nullable String metadata, @Ka2 @Nullable String url, @InterfaceC5396mt @NotNull AbstractC5395ms1 body);

    @NotNull
    @InterfaceC6219qn0
    LiveData<C4705jd<Void>> b(@Ka2 @NotNull String path);

    @InterfaceC4734jk0("/api/1.0/auth/media/sign/put")
    @InterfaceC3023bo0({"url:api"})
    @NotNull
    LiveData<C4705jd<MediaSignResponse>> c(@InterfaceC8102zl1("file_name") @NotNull String fileName, @InterfaceC8102zl1("client_id") @NotNull String clientId, @InterfaceC8102zl1("site_id") long siteId, @InterfaceC8102zl1("public_id") @NotNull String widgetId);
}
