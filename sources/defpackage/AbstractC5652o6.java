package defpackage;

import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5652o6 {

    /* JADX INFO: renamed from: o6$a */
    public static final class a extends AbstractC5652o6 {

        @NotNull
        public final String a;

        public a(@NotNull String nickname) {
            Intrinsics.checkNotNullParameter(nickname, "nickname");
            this.a = nickname;
        }
    }

    /* JADX INFO: renamed from: o6$b */
    public static final class b extends AbstractC5652o6 {

        @NotNull
        public final String a;

        public b(@NotNull String nickname) {
            Intrinsics.checkNotNullParameter(nickname, "nickname");
            this.a = nickname;
        }
    }

    /* JADX INFO: renamed from: o6$c */
    public static final class c extends AbstractC5652o6 {
        public final int a = R.string.trader_demo_text;
    }
}
