package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"LKI1;", "LQu0;", "Lju0;", "_outcomeController", "<init>", "(Lju0;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "addOutcome", "(Ljava/lang/String;)V", "addUniqueOutcome", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addOutcomeWithValue", "(Ljava/lang/String;F)V", "Lju0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class KI1 implements InterfaceC1875Qu0 {

    @NotNull
    private final InterfaceC4767ju0 _outcomeController;

    @InterfaceC3368dU(c = "com.onesignal.session.internal.SessionManager$addOutcome$1", f = "SessionManager.kt", l = {16}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, JM<? super a> jm) {
            super(1, jm);
            this.$name = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return KI1.this.new a(this.$name, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC4767ju0 interfaceC4767ju0 = KI1.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (interfaceC4767ju0.sendOutcomeEvent(str, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.session.internal.SessionManager$addOutcomeWithValue$1", f = "SessionManager.kt", l = {35}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f, JM<? super b> jm) {
            super(1, jm);
            this.$name = str;
            this.$value = f;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return KI1.this.new b(this.$name, this.$value, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC4767ju0 interfaceC4767ju0 = KI1.this._outcomeController;
                String str = this.$name;
                float f = this.$value;
                this.label = 1;
                if (interfaceC4767ju0.sendOutcomeEventWithValue(str, f, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.session.internal.SessionManager$addUniqueOutcome$1", f = "SessionManager.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, JM<? super c> jm) {
            super(1, jm);
            this.$name = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return KI1.this.new c(this.$name, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((c) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC4767ju0 interfaceC4767ju0 = KI1.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (interfaceC4767ju0.sendUniqueOutcomeEvent(str, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public KI1(@NotNull InterfaceC4767ju0 _outcomeController) {
        Intrinsics.checkNotNullParameter(_outcomeController, "_outcomeController");
        this._outcomeController = _outcomeController;
    }

    @Override // defpackage.InterfaceC1875Qu0
    public void addOutcome(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        NS0.log(EnumC5513nS0.DEBUG, "sendOutcome(name: " + name + ')');
        LY1.suspendifyOnThread$default(0, new a(name, null), 1, null);
    }

    @Override // defpackage.InterfaceC1875Qu0
    public void addOutcomeWithValue(@NotNull String name, float value) {
        Intrinsics.checkNotNullParameter(name, "name");
        NS0.log(EnumC5513nS0.DEBUG, "sendOutcomeWithValue(name: " + name + ", value: " + value + ')');
        LY1.suspendifyOnThread$default(0, new b(name, value, null), 1, null);
    }

    @Override // defpackage.InterfaceC1875Qu0
    public void addUniqueOutcome(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        NS0.log(EnumC5513nS0.DEBUG, "sendUniqueOutcome(name: " + name + ')');
        LY1.suspendifyOnThread$default(0, new c(name, null), 1, null);
    }
}
