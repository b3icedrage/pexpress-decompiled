package com.jivosite.sdk.model.pojo;

import defpackage.C1039Gc0;
import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/jivosite/sdk/model/pojo/CustomData;", "", "", "content", "title", "link", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/jivosite/sdk/model/pojo/CustomData;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class CustomData {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    public CustomData(@InterfaceC5477nG0(name = "content") @NotNull String content, @InterfaceC5477nG0(name = "title") @NotNull String title, @InterfaceC5477nG0(name = "link") @NotNull String link, @InterfaceC5477nG0(name = "key") @NotNull String key) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(key, "key");
        this.a = content;
        this.b = title;
        this.c = link;
        this.d = key;
    }

    @NotNull
    public final CustomData copy(@InterfaceC5477nG0(name = "content") @NotNull String content, @InterfaceC5477nG0(name = "title") @NotNull String title, @InterfaceC5477nG0(name = "link") @NotNull String link, @InterfaceC5477nG0(name = "key") @NotNull String key) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(key, "key");
        return new CustomData(content, title, link, key);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomData)) {
            return false;
        }
        CustomData customData = (CustomData) obj;
        return Intrinsics.a(this.a, customData.a) && Intrinsics.a(this.b, customData.b) && Intrinsics.a(this.c, customData.c) && Intrinsics.a(this.d, customData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomData(content=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", link=");
        sb.append(this.c);
        sb.append(", key=");
        return C1039Gc0.e(sb, this.d, ')');
    }
}
