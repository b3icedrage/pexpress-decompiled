package defpackage;

import androidx.fragment.app.g;
import com.pexpress.tool.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4701jc extends Z71 {

    @NotNull
    public final InterfaceC3560eO0<? extends InterfaceC3951gE1> n;

    @NotNull
    public final List<Integer> o;

    @NotNull
    public final List<Integer> p;

    @NotNull
    public final List<Integer> q;

    @NotNull
    public final List<Integer> r;

    @NotNull
    public final List<Integer> s;

    @NotNull
    public final List<Integer> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4701jc(@NotNull InterfaceC3560eO0 screensApi, @NotNull g fragmentActivity, @NotNull C4612j90 eventsFlowsProvider, @NotNull C3296d7 activityOnBackPressedProvider) {
        super(screensApi, fragmentActivity, eventsFlowsProvider, activityOnBackPressedProvider);
        Intrinsics.checkNotNullParameter(screensApi, "screensApi");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(activityOnBackPressedProvider, "activityOnBackPressedProvider");
        this.n = screensApi;
        Integer numValueOf = Integer.valueOf(R.anim.slide_in_left);
        Integer numValueOf2 = Integer.valueOf(R.anim.slide_out_left);
        Integer numValueOf3 = Integer.valueOf(R.anim.slide_in_right);
        Integer numValueOf4 = Integer.valueOf(R.anim.slide_out_right);
        this.o = WE.f(numValueOf, numValueOf2, numValueOf3, numValueOf4);
        Integer numValueOf5 = Integer.valueOf(android.R.anim.fade_in);
        Integer numValueOf6 = Integer.valueOf(android.R.anim.fade_out);
        this.p = WE.f(numValueOf5, numValueOf6, numValueOf5, numValueOf6);
        this.q = WE.f(numValueOf3, numValueOf4, 0, 0);
        Integer numValueOf7 = Integer.valueOf(R.anim.scale_strories_enter);
        Integer numValueOf8 = Integer.valueOf(R.anim.scale_strories_exit);
        this.r = WE.f(numValueOf7, numValueOf6, numValueOf8, numValueOf8);
        this.s = WE.f(numValueOf5, numValueOf8, numValueOf8, numValueOf8);
        this.t = WE.f(0, 0, 0, 0);
    }
}
