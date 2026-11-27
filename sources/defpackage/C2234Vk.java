package defpackage;

import io.sentry.protocol.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2234Vk {

    @Nullable
    public final byte[] a;

    @Nullable
    public final G b;

    @Nullable
    public final CallableC7578xG1 c;

    @NotNull
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    public C2234Vk(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.a = bArr;
        this.b = null;
        this.c = null;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public C2234Vk(@NotNull G g) {
        this.a = null;
        this.b = g;
        this.c = null;
        this.d = "view-hierarchy.json";
        this.e = "application/json";
        this.f = "event.view_hierarchy";
    }

    public C2234Vk(@NotNull CallableC7578xG1 callableC7578xG1) {
        this.a = null;
        this.b = null;
        this.c = callableC7578xG1;
        this.d = "screenshot.png";
        this.e = "image/png";
        this.f = "event.attachment";
    }
}
