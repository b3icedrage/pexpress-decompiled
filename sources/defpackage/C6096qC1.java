package defpackage;

import com.api.core.backend.domain.models.resultModels.StringCodeHttpErrorResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: qC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6096qC1 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Gson().f(TypeToken.get(StringCodeHttpErrorResponse.class));
    }
}
