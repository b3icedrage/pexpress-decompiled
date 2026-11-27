package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VH1 {

    public static final class a extends VH1 {

        @NotNull
        public static final a a = new a();
    }

    public static final class b extends VH1 {

        @NotNull
        public static final b a = new b();
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    @NotNull
    public final String toString() {
        String strF = C2017Sp1.a.b(getClass()).f();
        Intrinsics.checkNotNull(strF);
        return strF;
    }
}
