package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ma1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5328ma1 {

    @NotNull
    public final C4923kf a;

    public AbstractC5328ma1(@NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = appData;
    }

    @NotNull
    public String a() {
        FF ff = (FF) this.a.b.getValue();
        return "https://".concat(ff != null ? ff.g : "https://m.pocketoption.com");
    }
}
