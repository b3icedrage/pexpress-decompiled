package com.jivosite.sdk.model.pojo.socket;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJb\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/jivosite/sdk/model/pojo/socket/SocketMessage;", "", "", "type", "data", "id", "context", "to", "from", "parent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/jivosite/sdk/model/pojo/socket/SocketMessage;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SocketMessage {

    @NotNull
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;

    public SocketMessage(@InterfaceC5477nG0(name = "type") @NotNull String type, @InterfaceC5477nG0(name = "data") @Nullable String str, @InterfaceC5477nG0(name = "id") @Nullable String str2, @InterfaceC5477nG0(name = "context") @Nullable String str3, @InterfaceC5477nG0(name = "to") @Nullable String str4, @InterfaceC5477nG0(name = "from") @Nullable String str5, @InterfaceC5477nG0(name = "parent") @Nullable String str6) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @NotNull
    public final SocketMessage copy(@InterfaceC5477nG0(name = "type") @NotNull String type, @InterfaceC5477nG0(name = "data") @Nullable String data, @InterfaceC5477nG0(name = "id") @Nullable String id, @InterfaceC5477nG0(name = "context") @Nullable String context, @InterfaceC5477nG0(name = "to") @Nullable String to, @InterfaceC5477nG0(name = "from") @Nullable String from, @InterfaceC5477nG0(name = "parent") @Nullable String parent) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new SocketMessage(type, data, id, context, to, from, parent);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocketMessage)) {
            return false;
        }
        SocketMessage socketMessage = (SocketMessage) obj;
        return Intrinsics.a(this.a, socketMessage.a) && Intrinsics.a(this.b, socketMessage.b) && Intrinsics.a(this.c, socketMessage.c) && Intrinsics.a(this.d, socketMessage.d) && Intrinsics.a(this.e, socketMessage.e) && Intrinsics.a(this.f, socketMessage.f) && Intrinsics.a(this.g, socketMessage.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SocketMessage(type=");
        sb.append(this.a);
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", context=");
        sb.append(this.d);
        sb.append(", to=");
        sb.append(this.e);
        sb.append(", from=");
        sb.append(this.f);
        sb.append(", parent=");
        return C1039Gc0.e(sb, this.g, ')');
    }

    public /* synthetic */ SocketMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
