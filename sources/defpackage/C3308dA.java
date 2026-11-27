package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3308dA<T> {

    @NotNull
    public static final b b = new b();

    @Nullable
    public final Object a;

    /* JADX INFO: renamed from: dA$a */
    public static final class a extends b {

        @Nullable
        public final Throwable a;

        public a(@Nullable Throwable th) {
            this.a = th;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof a) {
                return Intrinsics.a(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // defpackage.C3308dA.b
        @NotNull
        public final String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    /* JADX INFO: renamed from: dA$b */
    public static class b {
        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    @Nullable
    public static final Throwable a(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3308dA) {
            return Intrinsics.a(this.a, ((C3308dA) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public final String toString() {
        Object obj = this.a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
