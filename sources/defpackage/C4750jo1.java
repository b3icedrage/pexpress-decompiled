package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4750jo1 implements InterfaceC6246qw0 {
    public final EM a;
    public final C6862ts b;
    public final C3665et c;
    public final C1948Rs1 d;
    public final ArrayList e;
    public final AtomicBoolean f;

    @NotNull
    public final KV g;

    @NotNull
    public final C2509Yn1 h;
    public final InterfaceC1086Gs i;
    public final OS1 j;
    public final Kf2 k;
    public final boolean l;

    /* JADX INFO: renamed from: jo1$a */
    @InterfaceC3368dU(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {117}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C7716xw0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7716xw0 c7716xw0, JM jm) {
            super(2, jm);
            this.g = c7716xw0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return C4750jo1.this.new a(this.g, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                obj = C4750jo1.this.b(this.g, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            AbstractC7926yw0 abstractC7926yw0 = (AbstractC7926yw0) obj;
            if (abstractC7926yw0 instanceof I70) {
                throw ((I70) abstractC7926yw0).c;
            }
            return Unit.a;
        }
    }

    public C4750jo1(@NotNull Context context, @NotNull KV defaults, @NotNull C2509Yn1 bitmapPool, @NotNull InterfaceC1086Gs referenceCounter, @NotNull OS1 strongMemoryCache, @NotNull Kf2 weakMemoryCache, @NotNull C4106h callFactory, @NotNull C5899pH componentRegistry, boolean z, boolean z2) {
        C7551x80 eventListenerFactory = InterfaceC7761y80.a.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(strongMemoryCache, "strongMemoryCache");
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        Intrinsics.checkNotNullParameter(componentRegistry, "componentRegistry");
        this.g = defaults;
        this.h = bitmapPool;
        this.i = referenceCounter;
        this.j = strongMemoryCache;
        this.k = weakMemoryCache;
        this.l = z2;
        C4002gV1 c4002gV1A = C0564Aa.a();
        RV rv = C6266r20.a;
        this.a = LN.a(CoroutineContext.Element.a.c(c4002gV1A, QV0.a.s1()).t(new C4531io1(this)));
        this.b = new C6862ts(this, referenceCounter);
        C3665et c3665et = new C3665et(referenceCounter, strongMemoryCache, weakMemoryCache);
        this.c = c3665et;
        C1948Rs1 c1948Rs1 = new C1948Rs1();
        this.d = c1948Rs1;
        Intrinsics.checkNotNullParameter(strongMemoryCache, "strongMemoryCache");
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        E30 e30 = new E30(bitmapPool);
        PW1 pw1 = new PW1(this, context);
        C5899pH.a aVar = new C5899pH.a(componentRegistry);
        aVar.b(new C5724oS1(), String.class);
        aVar.b(new C4916kd0(), Uri.class);
        aVar.b(new C7498wt1(context), Uri.class);
        aVar.b(new C6028pt1(context), Integer.class);
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        aVar.a(new C1240Ir0(callFactory), Uri.class);
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        aVar.a(new C1473Lr0(callFactory), C1318Jr0.class);
        aVar.a(new C1743Pc0(z), File.class);
        aVar.a(new C2495Yj(context), Uri.class);
        aVar.a(new C5071lM(context), Uri.class);
        aVar.a(new C7077ut1(context, e30), Uri.class);
        aVar.a(new F30(e30), Drawable.class);
        aVar.a(new C7913ys(), Bitmap.class);
        C7703xs decoder = new C7703xs(context);
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        ArrayList arrayList = aVar.d;
        arrayList.add(decoder);
        List listE0 = CollectionsKt.e0(aVar.a);
        this.e = CollectionsKt.R(listE0, new T60(new C5899pH(listE0, CollectionsKt.e0(aVar.b), CollectionsKt.e0(aVar.c), CollectionsKt.e0(arrayList)), bitmapPool, referenceCounter, strongMemoryCache, c3665et, c1948Rs1, pw1, e30));
        this.f = new AtomicBoolean(false);
    }

    @Override // defpackage.InterfaceC6246qw0
    @NotNull
    public final InterfaceC7527x20 a(@NotNull C7716xw0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C2936bP1 job = C5189lv.k(this.a, null, new a(request, null), 3);
        InterfaceC5739oX1 interfaceC5739oX1 = request.c;
        if (!(interfaceC5739oX1 instanceof InterfaceC7234ve2)) {
            Intrinsics.checkNotNullParameter(job, "job");
            return new C4466ii();
        }
        ViewOnAttachStateChangeListenerC8075ze2 viewOnAttachStateChangeListenerC8075ze2B = C4316i.b(((InterfaceC7234ve2) interfaceC5739oX1).e());
        Intrinsics.checkNotNullParameter(job, "job");
        UUID uuidRandomUUID = viewOnAttachStateChangeListenerC8075ze2B.e;
        if (uuidRandomUUID == null || !viewOnAttachStateChangeListenerC8075ze2B.g || !Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "UUID.randomUUID()");
        }
        viewOnAttachStateChangeListenerC8075ze2B.e = uuidRandomUUID;
        return new C4257hi(uuidRandomUUID, (InterfaceC7234ve2) request.c);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f9 A[Catch: all -> 0x0309, TryCatch #7 {all -> 0x0309, blocks: (B:108:0x02f0, B:110:0x02f9, B:112:0x02fd, B:114:0x0305), top: B:174:0x02f0 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x033a A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #5 {all -> 0x0067, blocks: (B:18:0x0062, B:136:0x0364, B:101:0x02ae, B:131:0x033a, B:133:0x033e), top: B:171:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x033e A[Catch: all -> 0x0067, TryCatch #5 {all -> 0x0067, blocks: (B:18:0x0062, B:136:0x0364, B:101:0x02ae, B:131:0x033a, B:133:0x033e), top: B:171:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0363  */
    /* JADX WARN: Code duplicated, block: B:150:0x0387 A[Catch: all -> 0x0045, TryCatch #4 {all -> 0x0045, blocks: (B:13:0x0040, B:154:0x03b4, B:148:0x0383, B:150:0x0387, B:157:0x03bd, B:158:0x03c3), top: B:171:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:157:0x03bd A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #4 {all -> 0x0045, blocks: (B:13:0x0040, B:154:0x03b4, B:148:0x0383, B:150:0x0387, B:157:0x03bd, B:158:0x03c3), top: B:171:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0247  */
    /* JADX WARN: Code duplicated, block: B:86:0x0269 A[Catch: all -> 0x028a, TRY_LEAVE, TryCatch #8 {all -> 0x028a, blocks: (B:81:0x024b, B:84:0x0263, B:86:0x0269, B:95:0x028c), top: B:177:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0280  */
    /* JADX WARN: Code duplicated, block: B:95:0x028c A[Catch: all -> 0x028a, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x028a, blocks: (B:81:0x024b, B:84:0x0263, B:86:0x0269, B:95:0x028c), top: B:177:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02aa  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020b, code lost:
    
        if (defpackage.C4994l.h(r12, r3) == r4) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [xw0] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, xw0] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, xw0] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26, types: [xw0$b] */
    /* JADX WARN: Type inference failed for: r11v29, types: [y80] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, oo1] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13, types: [xw0] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, xw0] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r19v0, types: [y80] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [xw0$b] */
    /* JADX WARN: Type inference failed for: r5v0, types: [coil.memory.RequestDelegate, int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r5v14, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, xw0$b] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v37, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, w80, y80] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, xw0$b, y80] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, y80] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r9v19, types: [xw0$b] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.C7716xw0 r21, defpackage.LM r22) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4750jo1.b(xw0, LM):java.lang.Object");
    }
}
