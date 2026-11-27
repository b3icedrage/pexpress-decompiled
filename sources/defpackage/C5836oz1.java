package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5836oz1 implements FU<Unit> {

    @NotNull
    public final MU a;

    @NotNull
    public final InterfaceC4619jB0 b;

    @NotNull
    public final InterfaceC5614nv1 c;

    @NotNull
    public final GU d;

    public C5836oz1(@NotNull MU deeplinkManagerCallbacks, @NotNull InterfaceC4619jB0 instructionListSaveUseCase, @NotNull InterfaceC5614nv1 robotBottomSheetDialogsDataFactory) {
        Intrinsics.checkNotNullParameter(deeplinkManagerCallbacks, "deeplinkManagerCallbacks");
        Intrinsics.checkNotNullParameter(instructionListSaveUseCase, "instructionListSaveUseCase");
        Intrinsics.checkNotNullParameter(robotBottomSheetDialogsDataFactory, "robotBottomSheetDialogsDataFactory");
        this.a = deeplinkManagerCallbacks;
        this.b = instructionListSaveUseCase;
        this.c = robotBottomSheetDialogsDataFactory;
        this.d = GU.NAVIGATE_TO_ROBOT_TRADING_OPTIONS_DESCRIPTION;
    }

    @Override // defpackage.FU
    public final Object a(Object obj, HU hu) {
        this.b.a(this.c.a(EnumC5404mv1.e), R.string.main_option_title);
        this.a.c();
        return Unit.a;
    }

    @Override // defpackage.FU
    @NotNull
    public final GU getKey() {
        return this.d;
    }
}
