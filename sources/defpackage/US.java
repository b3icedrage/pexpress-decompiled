package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
public final class US extends AW1 implements Function2<Boolean, JM<? super C4669jS<Object>>, Object> {
    public Object d;
    public int e;
    public /* synthetic */ boolean g;
    public final /* synthetic */ IS<Object> h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public US(IS<Object> is, int i, JM<? super US> jm) {
        super(2, jm);
        this.h = is;
        this.i = i;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        US us = new US(this.h, this.i, jm);
        us.g = ((Boolean) obj).booleanValue();
        return us;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, JM<? super C4669jS<Object>> jm) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((US) create(bool2, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        Object obj2;
        int iIntValue;
        int iHashCode;
        MN mn = MN.d;
        int i = this.e;
        IS<Object> is = this.h;
        if (i == 0) {
            C1795Pt1.b(obj);
            z = this.g;
            this.g = z;
            this.e = 1;
            obj = is.i(this);
            if (obj != mn) {
            }
            return mn;
        }
        if (i == 1) {
            z = this.g;
            C1795Pt1.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.d;
            C1795Pt1.b(obj);
        }
        iIntValue = ((Number) obj).intValue();
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C4669jS(obj2, iHashCode, iIntValue);
        if (z) {
            SB0 sb0G = is.g();
            this.d = obj;
            this.e = 2;
            Integer numE = sb0G.e();
            if (numE != mn) {
                obj2 = obj;
                obj = numE;
                iIntValue = ((Number) obj).intValue();
            }
            return mn;
        }
        obj2 = obj;
        iIntValue = this.i;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C4669jS(obj2, iHashCode, iIntValue);
    }
}
