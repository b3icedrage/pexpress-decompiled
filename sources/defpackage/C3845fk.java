package defpackage;

import com.impl.core.backend.modelsResponse.AllAssetsResponse;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AssetsDataSourceImpl$subscribeAssetChanged$1", f = "AssetsDataSourceImpl.kt", l = {}, m = "invokeSuspend")
public final class C3845fk extends AW1 implements InterfaceC1138Hj0<List<? extends AllAssetsResponse.AssetDto>, List<? extends AllAssetsResponse.AssetDto>, EnumC4164hF1, JM<? super List<? extends AllAssetsResponse.AssetDto>>, Object> {
    public /* synthetic */ List d;
    public /* synthetic */ List e;
    public /* synthetic */ EnumC4164hF1 g;

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        List list = this.d;
        List list2 = this.e;
        int iOrdinal = this.g.ordinal();
        if (iOrdinal == 0) {
            return list;
        }
        if (iOrdinal == 1) {
            return list2;
        }
        throw new C6489s51();
    }

    @Override // defpackage.InterfaceC1138Hj0
    public final Object l(List<? extends AllAssetsResponse.AssetDto> list, List<? extends AllAssetsResponse.AssetDto> list2, EnumC4164hF1 enumC4164hF1, JM<? super List<? extends AllAssetsResponse.AssetDto>> jm) {
        C3845fk c3845fk = new C3845fk(4, jm);
        c3845fk.d = list;
        c3845fk.e = list2;
        c3845fk.g = enumC4164hF1;
        return c3845fk.invokeSuspend(Unit.a);
    }
}
