package defpackage;

import com.api.core.backend.domain.models.responseModels.KnowledgeBaseValuesResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: aW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.SupportRepositoryBase$getKnowledgeBaseValues$2", f = "SupportRepositoryBase.kt", l = {17}, m = "invokeSuspend")
public final class C2733aW1 extends AW1 implements Function1<JM<? super KnowledgeBaseValuesResponse>, Object> {
    public int d;
    public final /* synthetic */ C2957bW1 e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2733aW1(C2957bW1 c2957bW1, String str, JM<? super C2733aW1> jm) {
        super(1, jm);
        this.e = c2957bW1;
        this.g = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2733aW1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super KnowledgeBaseValuesResponse> jm) {
        return ((C2733aW1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        InterfaceC5313mV1 interfaceC5313mV1 = this.e.b;
        this.d = 1;
        Object objA = interfaceC5313mV1.a(this.g, this);
        return objA == mn ? mn : objA;
    }
}
