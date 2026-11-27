package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.impl.core.backend.abstractModels.http.PlatformErrorBody;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: sC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6515sC1 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Gson().f(TypeToken.get(PlatformErrorBody.class));
    }
}
