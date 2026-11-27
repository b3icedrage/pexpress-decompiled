package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Gi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1057Gi0 {

    @NotNull
    public static final b a = b.b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Gi0$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final /* synthetic */ a[] l;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("PENALTY_LOG", 0);
            a aVar2 = new a("PENALTY_DEATH", 1);
            a aVar3 = new a("DETECT_FRAGMENT_REUSE", 2);
            d = aVar3;
            a aVar4 = new a("DETECT_FRAGMENT_TAG_USAGE", 3);
            e = aVar4;
            a aVar5 = new a("DETECT_WRONG_NESTED_HIERARCHY", 4);
            g = aVar5;
            a aVar6 = new a("DETECT_RETAIN_INSTANCE_USAGE", 5);
            h = aVar6;
            a aVar7 = new a("DETECT_SET_USER_VISIBLE_HINT", 6);
            i = aVar7;
            a aVar8 = new a("DETECT_TARGET_FRAGMENT_USAGE", 7);
            j = aVar8;
            a aVar9 = new a("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            k = aVar9;
            l = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) l.clone();
        }
    }

    /* JADX INFO: renamed from: Gi0$b */
    public static final class b {

        @NotNull
        public static final b b = new b(C6702t60.d, PW0.c());

        @NotNull
        public final C6702t60 a;

        public b(@NotNull C6702t60 flags, @NotNull C5863p60 allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.a = flags;
            new LinkedHashMap();
            C6702t60.d.getClass();
            C5443n60.d.getClass();
        }
    }

    public static b a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                parentFragmentManager.getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    public static void b(Ue2 ue2) {
        if (FragmentManager.G(3)) {
            ue2.d.getClass();
        }
    }

    public static final void c(@NotNull Fragment fragment, @NotNull String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        b(new C8089zi0(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).a.contains(a.d);
    }
}
