package defpackage;

import kotlin.Pair;
import kotlin.coroutines.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5300mR0 extends a implements EN {
    public final /* synthetic */ C4667jR0 e;
    public final /* synthetic */ String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5300mR0(C4667jR0 c4667jR0, String str) {
        EN.a aVar = EN.a.d;
        this.e = c4667jR0;
        this.g = str;
        super(aVar);
    }

    @Override // defpackage.EN
    public final void P(@NotNull Throwable th) {
        this.e.i.Y(th, OW0.b(new Pair("phase", this.g)));
    }
}
