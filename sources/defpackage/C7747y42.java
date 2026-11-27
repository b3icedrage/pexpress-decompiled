package defpackage;

import androidx.lifecycle.LiveData;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7747y42 {

    /* JADX INFO: renamed from: y42$a */
    public static final class a implements InterfaceC4819k81, InterfaceC1686Oj0 {
        public final /* synthetic */ ML0 a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = (ML0) function;
        }

        @Override // defpackage.InterfaceC1686Oj0
        @NotNull
        public final Function<?> a() {
            return this.a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [ML0, kotlin.jvm.functions.Function1] */
        @Override // defpackage.InterfaceC4819k81
        public final /* synthetic */ void d(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof InterfaceC4819k81) || !(obj instanceof InterfaceC1686Oj0)) {
                return false;
            }
            return this.a.equals(((InterfaceC1686Oj0) obj).a());
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final /* synthetic */ EY0 a(LiveData liveData, InterfaceC1608Nj0 mapFunction) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        EY0 ey0 = new EY0();
        ey0.l(liveData, new a(new C7537x42(mapFunction, ey0)));
        return ey0;
    }
}
