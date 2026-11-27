package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1515Mf0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C2590Zo1 d;
    public final /* synthetic */ InterfaceC6606sf0<T> e;

    /* JADX INFO: renamed from: Mf0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public final /* synthetic */ C1515Mf0<T> e;
        public int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C1515Mf0<? super T> c1515Mf0, JM<? super a> jm) {
            super(jm);
            this.e = c1515Mf0;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.g |= Integer.MIN_VALUE;
            return this.e.a(null, this);
        }
    }

    public C1515Mf0(InterfaceC6606sf0 interfaceC6606sf0, C2590Zo1 c2590Zo1) {
        this.d = c2590Zo1;
        this.e = interfaceC6606sf0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(T t, @NotNull JM<? super Unit> jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.g = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, jm);
            }
        } else {
            aVar = new a(this, jm);
        }
        Object obj = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C2590Zo1 c2590Zo1 = this.d;
            int i3 = c2590Zo1.d;
            if (i3 < 1) {
                c2590Zo1.d = i3 + 1;
                return Unit.a;
            }
            aVar.g = 1;
            if (this.e.a(t, aVar) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
