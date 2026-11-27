package com.jivosite.sdk.model.pojo.media;

import com.google.android.gms.common.internal.ImagesContract;
import com.jivosite.sdk.model.pojo.response.Response;
import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\\\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/jivosite/sdk/model/pojo/media/MediaSignResponse;", "Lcom/jivosite/sdk/model/pojo/response/Response;", "", "sign", "", "ts", "host", "metadata", "", "isOk", "", "errorList", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/jivosite/sdk/model/pojo/media/MediaSignResponse;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class MediaSignResponse extends Response {

    @Nullable
    public final String c;

    @Nullable
    public final Long d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;
    public final boolean g;

    @Nullable
    public final List<String> h;

    public MediaSignResponse() {
        this(null, null, null, null, false, null, 63, null);
    }

    @Override // com.jivosite.sdk.model.pojo.response.Response
    @Nullable
    public final List<String> a() {
        return this.h;
    }

    @Override // com.jivosite.sdk.model.pojo.response.Response
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getG() {
        return this.g;
    }

    @NotNull
    public final MediaSignResponse copy(@InterfaceC5477nG0(name = "sign") @Nullable String sign, @InterfaceC5477nG0(name = "ts") @Nullable Long ts, @InterfaceC5477nG0(name = ImagesContract.URL) @Nullable String host, @InterfaceC5477nG0(name = "metadata") @Nullable String metadata, @InterfaceC5477nG0(name = "ok") boolean isOk, @InterfaceC5477nG0(name = "error_list") @Nullable List<String> errorList) {
        return new MediaSignResponse(sign, ts, host, metadata, isOk, errorList);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSignResponse)) {
            return false;
        }
        MediaSignResponse mediaSignResponse = (MediaSignResponse) obj;
        return Intrinsics.a(this.c, mediaSignResponse.c) && Intrinsics.a(this.d, mediaSignResponse.d) && Intrinsics.a(this.e, mediaSignResponse.e) && Intrinsics.a(this.f, mediaSignResponse.f) && this.g == mediaSignResponse.g && Intrinsics.a(this.h, mediaSignResponse.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.d;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.g;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode4 + r2) * 31;
        List<String> list = this.h;
        return i + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "MediaSignResponse(sign=" + this.c + ", ts=" + this.d + ", host=" + this.e + ", metadata=" + this.f + ", isOk=" + this.g + ", errorList=" + this.h + ')';
    }

    public /* synthetic */ MediaSignResponse(String str, Long l, String str2, String str3, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : list);
    }

    public MediaSignResponse(@InterfaceC5477nG0(name = "sign") @Nullable String str, @InterfaceC5477nG0(name = "ts") @Nullable Long l, @InterfaceC5477nG0(name = ImagesContract.URL) @Nullable String str2, @InterfaceC5477nG0(name = "metadata") @Nullable String str3, @InterfaceC5477nG0(name = "ok") boolean z, @InterfaceC5477nG0(name = "error_list") @Nullable List<String> list) {
        super(false, null, 3, null);
        this.c = str;
        this.d = l;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = list;
    }
}
