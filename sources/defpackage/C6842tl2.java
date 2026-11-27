package defpackage;

import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.utils.WsApiUtilsKt$getRightMessages$$inlined$transform$1", f = "WsApiUtils.kt", l = {36}, m = "invokeSuspend")
public final class C6842tl2 extends AW1 implements Function2<InterfaceC6606sf0<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6632sl2 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ TypeToken i;

    /* JADX INFO: renamed from: tl2$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0<T> d;
        public final /* synthetic */ String e;
        public final /* synthetic */ TypeToken g;

        /* JADX INFO: renamed from: tl2$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.core.backend.utils.WsApiUtilsKt$getRightMessages$$inlined$transform$1$1", f = "WsApiUtils.kt", l = {227, 260, 267, 276, 279}, m = "emit")
        public static final class C0497a extends LM {
            public /* synthetic */ Object d;
            public int e;
            public a h;
            public JsonElement i;

            public C0497a(JM jm) {
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

        public a(InterfaceC6606sf0 interfaceC6606sf0, String str, TypeToken typeToken) {
            this.e = str;
            this.g = typeToken;
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0174 A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:102:0x018e  */
        /* JADX WARN: Code duplicated, block: B:111:0x01ab A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:113:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:114:0x01b9 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:121:0x01d8  */
        /* JADX WARN: Code duplicated, block: B:124:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:49:0x00a4 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #4 {all -> 0x00b5, blocks: (B:47:0x009e, B:49:0x00a4, B:46:0x0098), top: B:133:0x0098 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x00d3 A[Catch: all -> 0x00d1, TRY_ENTER, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x00d7 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x00e3 A[Catch: all -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x00f3 A[Catch: all -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x00fd A[Catch: all -> 0x00d1, TRY_ENTER, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x010c A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:81:0x0110 A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x0118  */
        /* JADX WARN: Code duplicated, block: B:84:0x011c A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:87:0x0124 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0140 A[Catch: all -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:93:0x014a A[Catch: all -> 0x00d1, TRY_ENTER, TryCatch #0 {all -> 0x00d1, blocks: (B:35:0x0066, B:53:0x00b9, B:55:0x00bd, B:65:0x00d3, B:67:0x00d7, B:70:0x00e3, B:73:0x00f3, B:76:0x00fd, B:84:0x011c, B:87:0x0124, B:90:0x0140, B:93:0x014a, B:98:0x0170, B:100:0x0174, B:79:0x010c, B:81:0x0110, B:109:0x0198, B:111:0x01ab, B:114:0x01b9), top: B:126:0x0066 }] */
        /* JADX WARN: Code duplicated, block: B:95:0x016c  */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x01ce, code lost:
        
            if (r10.a((T) r13, r0) == r1) goto L116;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v38 */
        /* JADX WARN: Type inference failed for: r13v47 */
        /* JADX WARN: Type inference failed for: r13v48 */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.InterfaceC6606sf0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(T r13, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 506
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C6842tl2.a.a(java.lang.Object, JM):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6842tl2(C6632sl2 c6632sl2, JM jm, String str, TypeToken typeToken) {
        super(2, jm);
        this.g = c6632sl2;
        this.h = str;
        this.i = typeToken;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C6842tl2 c6842tl2 = new C6842tl2(this.g, jm, this.h, this.i);
        c6842tl2.e = obj;
        return c6842tl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<Object> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((C6842tl2) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a((InterfaceC6606sf0) this.e, this.h, this.i);
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
