package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4897kY<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;
    public final /* synthetic */ C5530nY e;

    /* JADX INFO: renamed from: kY$a */
    @InterfaceC3368dU(c = "com.base.core.backend.updaters.DepositValuesUpdater$start$2$invokeSuspend$$inlined$filter$1$2", f = "DepositValuesUpdater.kt", l = {219}, m = "emit")
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
            return C4897kY.this.a(null, this);
        }
    }

    public C4897kY(InterfaceC6606sf0 interfaceC6606sf0, C5530nY c5530nY) {
        this.d = interfaceC6606sf0;
        this.e = c5530nY;
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
            InterfaceC6606sf0 interfaceC6606sf0 = this.d;
            long j = ((C6945uG) obj).a;
            Long l = this.e.e;
            if (l == null || j != l.longValue()) {
                aVar.e = 1;
                if (interfaceC6606sf0.a(obj, aVar) == mn) {
                    return mn;
                }
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
