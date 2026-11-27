package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* JADX INFO: renamed from: hq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class C4288hq1 extends C2784ak0 implements Function1<MatchResult, MatchResult> {
    public static final C4288hq1 m = new C4288hq1();

    public C4288hq1() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MatchResult invoke(MatchResult matchResult) {
        MatchResult p0 = matchResult;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.next();
    }
}
