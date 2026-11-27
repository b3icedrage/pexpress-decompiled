package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0729Cd<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;

    /* JADX INFO: renamed from: Cd$a */
    @InterfaceC3368dU(c = "com.base.app.app.App$initOurAnalytics$$inlined$map$1$2", f = "App.kt", l = {219}, m = "emit")
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
            return C0729Cd.this.a(null, this);
        }
    }

    public C0729Cd(InterfaceC6606sf0 interfaceC6606sf0) {
        this.d = interfaceC6606sf0;
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
            C6945uG c6945uG = (C6945uG) obj;
            InterfaceC6168qa1.a aVar2 = new InterfaceC6168qa1.a(c6945uG != null ? new Long(c6945uG.a).toString() : null, c6945uG != null ? c6945uG.b : null);
            aVar.e = 1;
            if (this.d.a(aVar2, aVar) == mn) {
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
