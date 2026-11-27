package defpackage;

import com.google.gson.reflect.TypeToken;
import com.impl.core.backend.modelsResponse.AllAssetsResponse;
import com.impl.core.backend.modelsResponse.AssetDtoDeserializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Qh2 implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ Qh2(int i) {
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return Unit.a;
            default:
                C4487in0 c4487in0 = new C4487in0();
                c4487in0.g = true;
                AssetDtoDeserializer assetDtoDeserializer = new AssetDtoDeserializer();
                boolean z = assetDtoDeserializer instanceof DH0;
                if (assetDtoDeserializer instanceof SA0) {
                    c4487in0.d.put(AllAssetsResponse.AssetDto.class, (SA0) assetDtoDeserializer);
                }
                ArrayList arrayList = c4487in0.e;
                TypeToken<?> typeToken = TypeToken.get((Type) AllAssetsResponse.AssetDto.class);
                arrayList.add(new C4130h52.b(assetDtoDeserializer, typeToken, typeToken.getType() == typeToken.getRawType()));
                return c4487in0.a();
        }
    }
}
