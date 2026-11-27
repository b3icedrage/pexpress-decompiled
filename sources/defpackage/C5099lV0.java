package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5099lV0 implements InterfaceC6396rf0<C0667Bi0> {
    public final /* synthetic */ FP1 d;
    public final /* synthetic */ ActivityC6781tV0 e;

    /* JADX INFO: renamed from: lV0$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;
        public final /* synthetic */ ActivityC6781tV0 e;

        /* JADX INFO: renamed from: lV0$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$initAll$$inlined$map$1$2", f = "MainActivity.kt", l = {219}, m = "emit")
        public static final class C0437a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0437a(JM jm) {
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

        public a(InterfaceC6606sf0 interfaceC6606sf0, ActivityC6781tV0 activityC6781tV0) {
            this.d = interfaceC6606sf0;
            this.e = activityC6781tV0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0437a c0437a;
            if (jm instanceof C0437a) {
                c0437a = (C0437a) jm;
                int i = c0437a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0437a.e = i - Integer.MIN_VALUE;
                } else {
                    c0437a = new C0437a(jm);
                }
            } else {
                c0437a = new C0437a(jm);
            }
            Object obj2 = c0437a.d;
            MN mn = MN.d;
            int i2 = c0437a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                String str = (String) obj;
                InterfaceC3951gE1 interfaceC3951gE1 = this.e.i;
                if (interfaceC3951gE1 == null) {
                    Intrinsics.l("screensProvider");
                    throw null;
                }
                C0667Bi0 c0667Bi0Y = interfaceC3951gE1.y(str);
                c0437a.e = 1;
                if (this.d.a(c0667Bi0Y, c0437a) == mn) {
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

    public C5099lV0(FP1 fp1, ActivityC6781tV0 activityC6781tV0) {
        this.d = fp1;
        this.e = activityC6781tV0;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super C0667Bi0> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0, this.e), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
