package defpackage;

import com.impl.core.backend.modelsResponse.AllAssetsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AssetsDataSourceImpl$subscribeAssetChanged$2", f = "AssetsDataSourceImpl.kt", l = {}, m = "invokeSuspend")
public final class C4055gk extends AW1 implements Function2<List<? extends AllAssetsResponse.AssetDto>, JM<? super Boolean>, Object> {
    public /* synthetic */ Object d;

    public C4055gk() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C4055gk c4055gk = new C4055gk(2, jm);
        c4055gk.d = obj;
        return c4055gk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends AllAssetsResponse.AssetDto> list, JM<? super Boolean> jm) {
        return ((C4055gk) create(list, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(((List) this.d) == null);
    }
}
