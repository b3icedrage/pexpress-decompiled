package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5816ot {

    @NotNull
    public static final a a = new a();

    @NotNull
    public static final C2498Yk<C5816ot> b = new C2498Yk<>("BodyProgress");

    /* JADX INFO: renamed from: ot$a */
    public static final class a implements InterfaceC4755jq0<Unit, C5816ot> {
        @Override // defpackage.InterfaceC4755jq0
        public final void a(C5816ot c5816ot, C1782Pp0 scope) throws C6514sC0 {
            AbstractC1355Kd1 abstractC1355Kd1;
            C1277Jd1 c1277Jd1;
            C5816ot plugin = c5816ot;
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            plugin.getClass();
            C1277Jd1 phase = new C1277Jd1("ObservableContent");
            C4539ir0 c4539ir0 = scope.i;
            C1277Jd1 reference = C4539ir0.i;
            c4539ir0.getClass();
            Intrinsics.checkNotNullParameter(reference, "reference");
            Intrinsics.checkNotNullParameter(phase, "phase");
            if (!c4539ir0.e(phase)) {
                int iC = c4539ir0.c(reference);
                if (iC == -1) {
                    throw new C6514sC0("Phase " + reference + " was not registered for this pipeline");
                }
                int i = iC + 1;
                ArrayList arrayList = c4539ir0.a;
                int iE = WE.e(arrayList);
                if (i <= iE) {
                    while (true) {
                        Object obj = arrayList.get(i);
                        C7860yd1 c7860yd1 = obj instanceof C7860yd1 ? (C7860yd1) obj : null;
                        if (c7860yd1 != null && (abstractC1355Kd1 = c7860yd1.b) != null) {
                            AbstractC1355Kd1.a aVar = abstractC1355Kd1 instanceof AbstractC1355Kd1.a ? (AbstractC1355Kd1.a) abstractC1355Kd1 : null;
                            if (aVar != null && (c1277Jd1 = aVar.a) != null && c1277Jd1.equals(reference)) {
                                iC = i;
                            }
                            if (i == iE) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList.add(iC + 1, new C7860yd1(phase, new AbstractC1355Kd1.a(reference)));
            }
            scope.i.f(phase, new C6026pt(3, null));
            scope.l.f(C2175Uq0.h, new C6236qt(3, null));
        }

        @Override // defpackage.InterfaceC4755jq0
        public final C5816ot b(Function1<? super Unit, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new C5816ot();
        }

        @Override // defpackage.InterfaceC4755jq0
        @NotNull
        public final C2498Yk<C5816ot> getKey() {
            return C5816ot.b;
        }
    }
}
