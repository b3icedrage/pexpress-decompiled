package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Av0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0628Av0 implements InterfaceC0784Cv0 {

    @NotNull
    public final InterfaceC4354i90 a;

    @NotNull
    public final DS0 b;

    @NotNull
    public final C3595ea c;

    /* JADX INFO: renamed from: Av0$a */
    @InterfaceC3368dU(c = "com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler", f = "IdentifyInterceptFileStorageHandler.kt", l = {69}, m = "clearIdentifyIntercepts")
    public static final class a extends LM {
        public C0628Av0 d;
        public /* synthetic */ Object e;
        public int h;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return C0628Av0.this.b(this);
        }
    }

    /* JADX INFO: renamed from: Av0$b */
    @InterfaceC3368dU(c = "com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler", f = "IdentifyInterceptFileStorageHandler.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, 36}, m = "getTransferIdentifyEvent")
    public static final class b extends LM {
        public C0628Av0 d;
        public C0612Aq e;
        public Map g;
        public Iterator h;
        public Object i;
        public /* synthetic */ Object j;
        public int l;

        public b(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return C0628Av0.this.a(this);
        }
    }

    /* JADX INFO: renamed from: Av0$c */
    @InterfaceC3368dU(c = "com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler$removeFile$1", f = "IdentifyInterceptFileStorageHandler.kt", l = {}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, JM<? super c> jm) {
            super(2, jm);
            this.e = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C0628Av0.this.new c(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C0628Av0.this.a.c(this.e);
            return Unit.a;
        }
    }

    public C0628Av0(@NotNull InterfaceC4354i90 storage, @NotNull DS0 logger, @NotNull C3595ea amplitude) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        this.a = storage;
        this.b = logger;
        this.c = amplitude;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:48|49|103|50|(2:119|52)(1:56)|57|(5:121|60|(5:124|62|109|63|127)(1:126)|125|58)|123|66|111|67|68|117|69|70) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:119|52) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:121|60|(5:124|62|109|63|127)(1:126)|125|58) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:124|62|109|63|127) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:46|(15:48|49|103|50|(2:119|52)(1:56)|57|(5:121|60|(5:124|62|109|63|127)(1:126)|125|58)|123|66|111|67|68|117|69|70)(1:79)|107|80|(2:83|81)|128|(1:85)|88|89) */
    /* JADX WARN: Code duplicated, block: B:101:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        if (r0 == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0138, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0139, code lost:
    
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0140, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a2 -> B:39:0x00a5). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC0784Cv0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.JM<? super defpackage.C0612Aq> r19) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0628Av0.a(JM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[LOOP:0: B:28:0x005b->B:30:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC0784Cv0
    @Nullable
    public final Object b(@NotNull JM<? super Unit> jm) {
        a aVar;
        C0628Av0 c0628Av0;
        String message;
        ArrayList arrayList;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((LM) jm);
            }
        } else {
            aVar = new a((LM) jm);
        }
        Object obj = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.h;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0628Av0 = aVar.d;
            try {
                C1795Pt1.b(obj);
                arrayList = (ArrayList) c0628Av0.a.a();
                if (arrayList.isEmpty()) {
                    return Unit.a;
                }
                for (Object obj2 : arrayList) {
                    Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                    c0628Av0.c((String) obj2);
                }
                return Unit.a;
            } catch (FileNotFoundException e) {
                e = e;
                message = e.getMessage();
                if (message != null) {
                    c0628Av0.b.warn("Event storage file not found: ".concat(message));
                }
                return Unit.a;
            }
        }
        C1795Pt1.b(obj);
        try {
            InterfaceC4354i90 interfaceC4354i90 = this.a;
            aVar.d = this;
            aVar.h = 1;
            if (interfaceC4354i90.d(aVar) == mn) {
                return mn;
            }
            c0628Av0 = this;
            arrayList = (ArrayList) c0628Av0.a.a();
            if (arrayList.isEmpty()) {
                return Unit.a;
            }
            while (r5.hasNext()) {
                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                c0628Av0.c((String) obj2);
            }
            return Unit.a;
        } catch (FileNotFoundException e2) {
            e = e2;
            c0628Av0 = this;
            message = e.getMessage();
            if (message != null) {
                c0628Av0.b.warn("Event storage file not found: ".concat(message));
            }
            return Unit.a;
        }
    }

    public final void c(String str) {
        C3595ea c3595ea = this.c;
        C5189lv.k(c3595ea.c, c3595ea.f, new c(str, null), 2);
    }
}
