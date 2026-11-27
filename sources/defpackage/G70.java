package defpackage;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface G70 {
    public static final a c = new a();

    public static class a implements G70 {
        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // defpackage.G70
        public final void b(@NotNull InterfaceC1490Lx interfaceC1490Lx) {
            if (interfaceC1490Lx != null) {
                return;
            }
            a(2);
            throw null;
        }

        @Override // defpackage.G70
        public final void c(@NotNull FC fc, @NotNull ArrayList arrayList) {
            if (fc != null) {
                return;
            }
            a(0);
            throw null;
        }
    }

    void b(@NotNull InterfaceC1490Lx interfaceC1490Lx);

    void c(@NotNull FC fc, @NotNull ArrayList arrayList);
}
