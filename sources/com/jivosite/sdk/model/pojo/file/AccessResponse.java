package com.jivosite.sdk.model.pojo.file;

import com.google.android.gms.common.internal.ImagesContract;
import com.jivosite.sdk.model.pojo.response.Response;
import defpackage.C1039Gc0;
import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ`\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/jivosite/sdk/model/pojo/file/AccessResponse;", "Lcom/jivosite/sdk/model/pojo/response/Response;", "", "isOk", "", ImagesContract.URL, "date", "policy", "credential", "algorithm", "signature", "key", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/jivosite/sdk/model/pojo/file/AccessResponse;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AccessResponse extends Response {
    public final boolean c;

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    @NotNull
    public final String f;

    @NotNull
    public final String g;

    @NotNull
    public final String h;

    @NotNull
    public final String i;

    @NotNull
    public final String j;

    public /* synthetic */ AccessResponse(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // com.jivosite.sdk.model.pojo.response.Response
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @NotNull
    public final AccessResponse copy(@InterfaceC5477nG0(name = "ok") boolean isOk, @InterfaceC5477nG0(name = ImagesContract.URL) @NotNull String url, @InterfaceC5477nG0(name = "date") @NotNull String date, @InterfaceC5477nG0(name = "policy") @NotNull String policy, @InterfaceC5477nG0(name = "credential") @NotNull String credential, @InterfaceC5477nG0(name = "algorithm") @NotNull String algorithm, @InterfaceC5477nG0(name = "signature") @NotNull String signature, @InterfaceC5477nG0(name = "key") @NotNull String key) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(key, "key");
        return new AccessResponse(isOk, url, date, policy, credential, algorithm, signature, key);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessResponse)) {
            return false;
        }
        AccessResponse accessResponse = (AccessResponse) obj;
        return this.c == accessResponse.c && Intrinsics.a(this.d, accessResponse.d) && Intrinsics.a(this.e, accessResponse.e) && Intrinsics.a(this.f, accessResponse.f) && Intrinsics.a(this.g, accessResponse.g) && Intrinsics.a(this.h, accessResponse.h) && Intrinsics.a(this.i, accessResponse.i) && Intrinsics.a(this.j, accessResponse.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.j.hashCode() + C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(r0 * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessResponse(isOk=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", date=");
        sb.append(this.e);
        sb.append(", policy=");
        sb.append(this.f);
        sb.append(", credential=");
        sb.append(this.g);
        sb.append(", algorithm=");
        sb.append(this.h);
        sb.append(", signature=");
        sb.append(this.i);
        sb.append(", key=");
        return C1039Gc0.e(sb, this.j, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessResponse(@InterfaceC5477nG0(name = "ok") boolean z, @InterfaceC5477nG0(name = ImagesContract.URL) @NotNull String url, @InterfaceC5477nG0(name = "date") @NotNull String date, @InterfaceC5477nG0(name = "policy") @NotNull String policy, @InterfaceC5477nG0(name = "credential") @NotNull String credential, @InterfaceC5477nG0(name = "algorithm") @NotNull String algorithm, @InterfaceC5477nG0(name = "signature") @NotNull String signature, @InterfaceC5477nG0(name = "key") @NotNull String key) {
        super(false, null, 3, null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(key, "key");
        this.c = z;
        this.d = url;
        this.e = date;
        this.f = policy;
        this.g = credential;
        this.h = algorithm;
        this.i = signature;
        this.j = key;
    }
}
