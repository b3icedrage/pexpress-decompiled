package defpackage;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6223qo1 extends AbstractC1091Gt1 {

    @Nullable
    public final String e;
    public final long g;

    @NotNull
    public final C3024bo1 h;

    public C6223qo1(@Nullable String str, long j, @NotNull C3024bo1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.e = str;
        this.g = j;
        this.h = source;
    }

    @Override // defpackage.AbstractC1091Gt1
    public final long f() {
        return this.g;
    }

    @Override // defpackage.AbstractC1091Gt1
    @Nullable
    public final CY0 g() {
        String str = this.e;
        if (str == null) {
            return null;
        }
        Pattern pattern = CY0.d;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return CY0.a.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.AbstractC1091Gt1
    @NotNull
    public final InterfaceC2833av k() {
        return this.h;
    }
}
