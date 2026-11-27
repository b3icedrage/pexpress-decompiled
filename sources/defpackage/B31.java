package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class B31 implements InterfaceC6396rf0<Void> {
    public final /* synthetic */ GP1 d;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;

        /* JADX INFO: renamed from: B31$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.app.services.NetworkManager$listenWSStateWithTriggerOnCanShowNotification$$inlined$mapNotNull$1$2", f = "NetworkManager.kt", l = {221}, m = "emit")
        public static final class C0003a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0003a(JM jm) {
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

        public a(InterfaceC6606sf0 interfaceC6606sf0) {
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0003a c0003a;
            if (jm instanceof C0003a) {
                c0003a = (C0003a) jm;
                int i = c0003a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0003a.e = i - Integer.MIN_VALUE;
                } else {
                    c0003a = new C0003a(jm);
                }
            } else {
                c0003a = new C0003a(jm);
            }
            Object obj2 = c0003a.d;
            MN mn = MN.d;
            int i2 = c0003a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj2);
            }
            return Unit.a;
        }
    }

    public B31(GP1 gp1) {
        this.d = gp1;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Void> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
        this.d.c(new a(interfaceC6606sf0), jm);
        return MN.d;
    }
}
