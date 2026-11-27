package defpackage;

import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.utils.WsApiUtilsKt$getRightMessagesFromList$$inlined$transform$1", f = "WsApiUtils.kt", l = {36}, m = "invokeSuspend")
public final class C7262vl2 extends AW1 implements Function2<InterfaceC6606sf0<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C7052ul2 g;
    public final /* synthetic */ TypeToken h;
    public final /* synthetic */ TypeToken i;
    public final /* synthetic */ String j;

    /* JADX INFO: renamed from: vl2$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0<T> d;
        public final /* synthetic */ TypeToken e;
        public final /* synthetic */ TypeToken g;
        public final /* synthetic */ String h;

        /* JADX INFO: renamed from: vl2$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.core.backend.utils.WsApiUtilsKt$getRightMessagesFromList$$inlined$transform$1$1", f = "WsApiUtils.kt", l = {225, 240, 247, 250}, m = "emit")
        public static final class C0515a extends LM {
            public /* synthetic */ Object d;
            public int e;
            public a h;
            public JsonElement i;
            public InterfaceC6606sf0 j;

            public C0515a(JM jm) {
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

        public a(InterfaceC6606sf0 interfaceC6606sf0, TypeToken typeToken, TypeToken typeToken2, String str) {
            this.e = typeToken;
            this.g = typeToken2;
            this.h = str;
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:56:0x011a  */
        /* JADX WARN: Code duplicated, block: B:61:0x0133 A[Catch: Exception -> 0x011c, TryCatch #3 {Exception -> 0x011c, blocks: (B:53:0x0108, B:61:0x0133, B:62:0x0137, B:64:0x013d, B:65:0x0149, B:69:0x015a, B:71:0x016d, B:72:0x0171, B:74:0x0177, B:75:0x0183, B:78:0x0193, B:59:0x0120), top: B:88:0x0108, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x013d A[Catch: Exception -> 0x011c, LOOP:0: B:62:0x0137->B:64:0x013d, LOOP_END, TryCatch #3 {Exception -> 0x011c, blocks: (B:53:0x0108, B:61:0x0133, B:62:0x0137, B:64:0x013d, B:65:0x0149, B:69:0x015a, B:71:0x016d, B:72:0x0171, B:74:0x0177, B:75:0x0183, B:78:0x0193, B:59:0x0120), top: B:88:0x0108, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0157  */
        /* JADX WARN: Code duplicated, block: B:69:0x015a A[Catch: Exception -> 0x011c, TryCatch #3 {Exception -> 0x011c, blocks: (B:53:0x0108, B:61:0x0133, B:62:0x0137, B:64:0x013d, B:65:0x0149, B:69:0x015a, B:71:0x016d, B:72:0x0171, B:74:0x0177, B:75:0x0183, B:78:0x0193, B:59:0x0120), top: B:88:0x0108, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x016d A[Catch: Exception -> 0x011c, TryCatch #3 {Exception -> 0x011c, blocks: (B:53:0x0108, B:61:0x0133, B:62:0x0137, B:64:0x013d, B:65:0x0149, B:69:0x015a, B:71:0x016d, B:72:0x0171, B:74:0x0177, B:75:0x0183, B:78:0x0193, B:59:0x0120), top: B:88:0x0108, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0177 A[Catch: Exception -> 0x011c, LOOP:1: B:72:0x0171->B:74:0x0177, LOOP_END, TryCatch #3 {Exception -> 0x011c, blocks: (B:53:0x0108, B:61:0x0133, B:62:0x0137, B:64:0x013d, B:65:0x0149, B:69:0x015a, B:71:0x016d, B:72:0x0171, B:74:0x0177, B:75:0x0183, B:78:0x0193, B:59:0x0120), top: B:88:0x0108, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:77:0x0192  */
        /* JADX WARN: Code duplicated, block: B:78:0x0193 A[Catch: Exception -> 0x011c, TRY_LEAVE, TryCatch #3 {Exception -> 0x011c, blocks: (B:53:0x0108, B:61:0x0133, B:62:0x0137, B:64:0x013d, B:65:0x0149, B:69:0x015a, B:71:0x016d, B:72:0x0171, B:74:0x0177, B:75:0x0183, B:78:0x0193, B:59:0x0120), top: B:88:0x0108, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
        
            if (r5.a(r0, r3) == r4) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x01af, code lost:
        
            if (r5.a(r2, r3) == r4) goto L80;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r17v0, types: [T] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v2, types: [vl2$a] */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v6 */
        @Override // defpackage.InterfaceC6606sf0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(T r17, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 478
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C7262vl2.a.a(java.lang.Object, JM):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7262vl2(C7052ul2 c7052ul2, JM jm, TypeToken typeToken, TypeToken typeToken2, String str) {
        super(2, jm);
        this.g = c7052ul2;
        this.h = typeToken;
        this.i = typeToken2;
        this.j = str;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C7262vl2 c7262vl2 = new C7262vl2(this.g, jm, this.h, this.i, this.j);
        c7262vl2.e = obj;
        return c7262vl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<Object> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((C7262vl2) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a((InterfaceC6606sf0) this.e, this.h, this.i, this.j);
            this.d = 1;
            if (this.g.c(aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
