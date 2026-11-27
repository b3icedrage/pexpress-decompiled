package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2538Yx0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;
    public final /* synthetic */ C1491Lx0 e;

    /* JADX INFO: renamed from: Yx0$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.providers.IndicatorDetailsSelectionProviderBase$selectIndicatorDetails$$inlined$mapNotNull$1$2", f = "IndicatorDetailsSelectionProviderBase.kt", l = {228}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C2538Yx0.this.a(null, this);
        }
    }

    public C2538Yx0(InterfaceC6606sf0 interfaceC6606sf0, C1491Lx0 c1491Lx0) {
        this.d = interfaceC6606sf0;
        this.e = c1491Lx0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(Object obj, @NotNull JM jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj2 = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.e;
        if (i2 == 0) {
            C1795Pt1.b(obj2);
            Iterator it = ((List) obj).iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (Intrinsics.a(((C2846az0) it.next()).a.b, this.e.b)) {
                    break;
                }
                i3++;
            }
            Integer num = new Integer(i3);
            aVar.e = 1;
            if (this.d.a(num, aVar) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj2);
        }
        return Unit.a;
    }
}
