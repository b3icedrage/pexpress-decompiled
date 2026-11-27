package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class HV0 implements InterfaceC6396rf0<C2343Wt> {
    public final /* synthetic */ C4250hg0 d;
    public final /* synthetic */ IV0 e;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;
        public final /* synthetic */ IV0 e;

        /* JADX INFO: renamed from: HV0$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivityViewModel$handleNavigation$$inlined$map$1$2", f = "MainActivityViewModel.kt", l = {219}, m = "emit")
        public static final class C0043a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0043a(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC6606sf0 interfaceC6606sf0, IV0 iv0) {
            this.d = interfaceC6606sf0;
            this.e = iv0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0043a c0043a;
            if (jm instanceof C0043a) {
                c0043a = (C0043a) jm;
                int i = c0043a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0043a.e = i - Integer.MIN_VALUE;
                } else {
                    c0043a = new C0043a(jm);
                }
            } else {
                c0043a = new C0043a(jm);
            }
            Object obj2 = c0043a.d;
            MN mn = MN.d;
            int i2 = c0043a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                C0667Bi0 c0667Bi0 = (C0667Bi0) obj;
                boolean z = c0667Bi0.e;
                IV0 iv0 = this.e;
                iv0.p = z;
                Integer num = c0667Bi0.g;
                if (num != null) {
                    iv0.m.i(Integer.valueOf(num.intValue()));
                }
                iv0.l.i(Integer.valueOf(c0667Bi0.f));
                C2343Wt c2343WtZ = IV0.z(iv0);
                c2343WtZ.a = ((Boolean) iv0.e.i.d.getValue()).booleanValue() && c0667Bi0.equals(iv0.d.k());
                c0043a.e = 1;
                if (this.d.a(c2343WtZ, c0043a) == mn) {
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

    public HV0(C4250hg0 c4250hg0, IV0 iv0) {
        this.d = c4250hg0;
        this.e = iv0;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super C2343Wt> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0, this.e), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
