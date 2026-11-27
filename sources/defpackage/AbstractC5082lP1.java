package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5082lP1 {

    @NotNull
    public final String a;

    /* JADX INFO: renamed from: lP1$a */
    public static final class a extends AbstractC5082lP1 {
    }

    /* JADX INFO: renamed from: lP1$b */
    public static final class b extends AbstractC5082lP1 {

        @NotNull
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String site) {
            super("scope_unavailable");
            Intrinsics.checkNotNullParameter(site, "site");
            this.b = site;
        }
    }

    public AbstractC5082lP1(String str) {
        this.a = str;
    }
}
