package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6635sm1 extends TF {

    @NotNull
    public final String p;

    @NotNull
    public final Function0<Unit> q;

    @NotNull
    public final Function2<Integer, Boolean, Unit> r;

    @NotNull
    public final Function1<Integer, Unit> s;

    @NotNull
    public final Function1<Integer, Unit> t;

    /* JADX INFO: renamed from: sm1$a */
    public static final class a extends TF.a<C6635sm1> {

        @NotNull
        public Function0<Unit> b = new C6425rm1(0);

        @NotNull
        public Function2<? super Integer, ? super Boolean, Unit> c = new C8017zN(2);

        @NotNull
        public Function1<? super Integer, Unit> d = new C5980pg(1);

        @NotNull
        public Function1<? super Integer, Unit> e = new LA(2);

        @NotNull
        public String f = "";
    }

    public C6635sm1(@NotNull String packageName, @NotNull Function0 openChatAction, @NotNull Function1 closeAction, @NotNull Function1 noActionIfRated, @NotNull Function2 buttonAction) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(openChatAction, "openChatAction");
        Intrinsics.checkNotNullParameter(buttonAction, "buttonAction");
        Intrinsics.checkNotNullParameter(closeAction, "closeAction");
        Intrinsics.checkNotNullParameter(noActionIfRated, "noActionIfRated");
        this.p = packageName;
        this.q = openChatAction;
        this.r = buttonAction;
        this.s = closeAction;
        this.t = noActionIfRated;
    }
}
