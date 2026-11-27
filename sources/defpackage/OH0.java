package defpackage;

import kotlin.Unit;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
public final class OH0 extends AbstractC1639Nt1 implements InterfaceC1060Gj0<DU<Unit, JsonElement>, Unit, JM<? super JsonElement>, Object> {
    public int e;
    public /* synthetic */ DU g;
    public final /* synthetic */ QH0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OH0(QH0 qh0, JM<? super OH0> jm) {
        super(3, jm);
        this.h = qh0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            DU du = this.g;
            QH0 qh0 = this.h;
            AbstractC4995l0 abstractC4995l0 = qh0.a;
            byte bW = abstractC4995l0.w();
            if (bW == 1) {
                return qh0.d(true);
            }
            if (bW == 0) {
                return qh0.d(false);
            }
            if (bW != 6) {
                if (bW == 8) {
                    return qh0.c();
                }
                AbstractC4995l0.r(abstractC4995l0, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.e = 1;
            obj = QH0.a(qh0, du, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return (JsonElement) obj;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(DU<Unit, JsonElement> du, Unit unit, JM<? super JsonElement> jm) {
        OH0 oh0 = new OH0(this.h, jm);
        oh0.g = du;
        return oh0.invokeSuspend(Unit.a);
    }
}
