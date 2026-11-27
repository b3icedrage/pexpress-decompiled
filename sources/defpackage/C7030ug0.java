package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ug0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", l = {269}, m = "invokeSuspend")
public final class C7030ug0 extends AW1 implements Function2<InterfaceC6606sf0<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ InterfaceC6396rf0[] g;
    public final /* synthetic */ C4698jb0 h;

    /* JADX INFO: renamed from: ug0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", l = {329}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<Object>, Object[], JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ InterfaceC6606sf0 e;
        public /* synthetic */ Object[] g;
        public final /* synthetic */ C4698jb0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JM jm, C4698jb0 c4698jb0) {
            super(3, jm);
            this.h = c4698jb0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC6606sf0 interfaceC6606sf0 = this.e;
                Object[] objArr = this.g;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.d = 1;
                if (this.h.l(interfaceC6606sf0, obj2, obj3, this) == mn) {
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

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(InterfaceC6606sf0<Object> interfaceC6606sf0, Object[] objArr, JM<? super Unit> jm) {
            a aVar = new a(jm, this.h);
            aVar.e = interfaceC6606sf0;
            aVar.g = objArr;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7030ug0(InterfaceC6396rf0[] interfaceC6396rf0Arr, JM jm, C4698jb0 c4698jb0) {
        super(2, jm);
        this.g = interfaceC6396rf0Arr;
        this.h = c4698jb0;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C7030ug0 c7030ug0 = new C7030ug0(this.g, jm, this.h);
        c7030ug0.e = obj;
        return c7030ug0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<Object> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((C7030ug0) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC6606sf0 interfaceC6606sf0 = (InterfaceC6606sf0) this.e;
            a aVar = new a(null, this.h);
            this.d = 1;
            if (C4372iF.a(this, interfaceC6606sf0, aVar, C7240vg0.d, this.g) == mn) {
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
