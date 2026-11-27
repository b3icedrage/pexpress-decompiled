package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: as, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2824as {

    @NotNull
    public final String a;
    public final long b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    public C2824as(@NotNull String kind, @Nullable String str, @Nullable String str2, @Nullable String str3, long j) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.a = kind;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @NotNull
    public final String a() {
        return "kind=" + this.a + ";elapsed_ms=" + this.b + ";ws_at_start=" + this.d;
    }

    @NotNull
    public final String b() {
        String str = this.c;
        if (str == null) {
            str = DevicePublicKeyStringDef.NONE;
        }
        StringBuilder sbB = K1.b(str, "|ws=");
        sbB.append(this.e);
        return sbB.toString();
    }
}
