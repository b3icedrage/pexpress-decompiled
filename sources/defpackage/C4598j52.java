package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: j52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b1\u0010,J\u001f\u00104\u001a\u00020$2\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0013H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020$2\u0006\u00107\u001a\u0002062\u0006\u00103\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020$2\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0013H\u0016¢\u0006\u0004\b:\u00105J\u0017\u0010=\u001a\u00020$2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020$2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b?\u0010>R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010@R'\u0010B\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001a0A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lj52;", "Lkv0;", "Lvt0;", "Lk52;", "Ll52;", "triggerModelStore", "LW40;", "_dynamicTriggerController", "<init>", "(Ll52;LW40;)V", "", "Li52;", "andConditions", "", "evaluateAndTriggers", "(Ljava/util/List;)Z", "trigger", "evaluateTrigger", "(Li52;)Z", "", "triggerValue", "deviceValue", "Li52$b;", "operator", "triggerMatchesStringValue", "(Ljava/lang/String;Ljava/lang/String;Li52$b;)Z", "", "triggerMatchesFlex", "(Ljava/lang/Object;Ljava/lang/Object;Li52$b;)Z", "", "triggerMatchesNumericValueFlex", "(Ljava/lang/Number;Ljava/lang/String;Li52$b;)Z", "triggerMatchesNumericValue", "(Ljava/lang/Number;Ljava/lang/Number;Li52$b;)Z", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "addTriggers", "(Ljava/lang/String;Ljava/lang/Object;)V", "removeTriggersForKeys", "(Ljava/lang/String;)V", "LQw0;", "message", "evaluateMessageTriggers", "(LQw0;)Z", "", "triggersKeys", "isTriggerOnMessage", "(LQw0;Ljava/util/Collection;)Z", "messageHasOnlyDynamicTriggers", "model", "tag", "onModelAdded", "(Lk52;Ljava/lang/String;)V", "LH01;", "args", "onModelUpdated", "(LH01;Ljava/lang/String;)V", "onModelRemoved", "Llv0;", "handler", "subscribe", "(Llv0;)V", "unsubscribe", "LW40;", "Ljava/util/concurrent/ConcurrentHashMap;", "triggers", "Ljava/util/concurrent/ConcurrentHashMap;", "getTriggers", "()Ljava/util/concurrent/ConcurrentHashMap;", "getHasSubscribers", "()Z", "hasSubscribers", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C4598j52 implements InterfaceC4980kv0, InterfaceC7286vt0<C4808k52> {

    @NotNull
    private W40 _dynamicTriggerController;

    @NotNull
    private final ConcurrentHashMap<String, Object> triggers;

    /* JADX INFO: renamed from: j52$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C4340i52.b.values().length];
            iArr[C4340i52.b.EQUAL_TO.ordinal()] = 1;
            iArr[C4340i52.b.NOT_EQUAL_TO.ordinal()] = 2;
            iArr[C4340i52.b.EXISTS.ordinal()] = 3;
            iArr[C4340i52.b.CONTAINS.ordinal()] = 4;
            iArr[C4340i52.b.NOT_EXISTS.ordinal()] = 5;
            iArr[C4340i52.b.LESS_THAN.ordinal()] = 6;
            iArr[C4340i52.b.GREATER_THAN.ordinal()] = 7;
            iArr[C4340i52.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 8;
            iArr[C4340i52.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: j52$b */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llv0;", "it", "", "invoke", "(Llv0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends ML0 implements Function1<InterfaceC5190lv0, Unit> {
        final /* synthetic */ C4808k52 $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4808k52 c4808k52) {
            super(1);
            this.$model = c4808k52;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5190lv0 interfaceC5190lv0) {
            invoke2(interfaceC5190lv0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC5190lv0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onTriggerChanged(this.$model.getKey());
        }
    }

    /* JADX INFO: renamed from: j52$c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llv0;", "it", "", "invoke", "(Llv0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c extends ML0 implements Function1<InterfaceC5190lv0, Unit> {
        final /* synthetic */ C4808k52 $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4808k52 c4808k52) {
            super(1);
            this.$model = c4808k52;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5190lv0 interfaceC5190lv0) {
            invoke2(interfaceC5190lv0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC5190lv0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onTriggerChanged(this.$model.getKey());
        }
    }

    public C4598j52(@NotNull C5018l52 triggerModelStore, @NotNull W40 _dynamicTriggerController) {
        Intrinsics.checkNotNullParameter(triggerModelStore, "triggerModelStore");
        Intrinsics.checkNotNullParameter(_dynamicTriggerController, "_dynamicTriggerController");
        this._dynamicTriggerController = _dynamicTriggerController;
        this.triggers = new ConcurrentHashMap<>();
        triggerModelStore.subscribe((InterfaceC7286vt0) this);
    }

    private final void addTriggers(String key, Object value) {
        synchronized (this.triggers) {
            this.triggers.put(key, value);
            Unit unit = Unit.a;
        }
    }

    private final boolean evaluateAndTriggers(List<C4340i52> andConditions) {
        Iterator<C4340i52> it = andConditions.iterator();
        while (it.hasNext()) {
            if (!evaluateTrigger(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final boolean evaluateTrigger(C4340i52 trigger) {
        if (trigger.getKind() == C4340i52.a.UNKNOWN) {
            return false;
        }
        if (trigger.getKind() != C4340i52.a.CUSTOM) {
            return this._dynamicTriggerController.dynamicTriggerShouldFire(trigger);
        }
        C4340i52.b operatorType = trigger.getOperatorType();
        Object obj = this.triggers.get(trigger.getProperty());
        if (obj == null) {
            if (operatorType == C4340i52.b.NOT_EXISTS) {
                return true;
            }
            return operatorType == C4340i52.b.NOT_EQUAL_TO && trigger.getValue() != null;
        }
        if (operatorType == C4340i52.b.EXISTS) {
            return true;
        }
        if (operatorType == C4340i52.b.NOT_EXISTS) {
            return false;
        }
        if (operatorType == C4340i52.b.CONTAINS) {
            return (obj instanceof Collection) && ((Collection) obj).contains(trigger.getValue());
        }
        if ((obj instanceof String) && (trigger.getValue() instanceof String)) {
            String str = (String) trigger.getValue();
            Intrinsics.checkNotNull(str);
            if (triggerMatchesStringValue(str, (String) obj, operatorType)) {
                return true;
            }
        }
        if ((trigger.getValue() instanceof Number) && (obj instanceof Number)) {
            Number number = (Number) trigger.getValue();
            Intrinsics.checkNotNull(number);
            if (triggerMatchesNumericValue(number, (Number) obj, operatorType)) {
                return true;
            }
        }
        return triggerMatchesFlex(trigger.getValue(), obj, operatorType);
    }

    private final void removeTriggersForKeys(String key) {
        synchronized (this.triggers) {
            this.triggers.remove(key);
        }
    }

    private final boolean triggerMatchesFlex(Object triggerValue, Object deviceValue, C4340i52.b operator) {
        if (triggerValue == null) {
            return false;
        }
        if (!operator.checksEquality()) {
            if ((deviceValue instanceof String) && (triggerValue instanceof Number)) {
                return triggerMatchesNumericValueFlex((Number) triggerValue, (String) deviceValue, operator);
            }
            return false;
        }
        String string = triggerValue.toString();
        String string2 = deviceValue.toString();
        if (deviceValue instanceof Number) {
            string2 = new DecimalFormat("0.#").format(deviceValue);
            Intrinsics.checkNotNullExpressionValue(string2, "format.format(deviceValue)");
        }
        return triggerMatchesStringValue(string, string2, operator);
    }

    private final boolean triggerMatchesNumericValue(Number triggerValue, Number deviceValue, C4340i52.b operator) {
        double dDoubleValue = triggerValue.doubleValue();
        double dDoubleValue2 = deviceValue.doubleValue();
        switch (a.$EnumSwitchMapping$0[operator.ordinal()]) {
            case 1:
                return dDoubleValue2 == dDoubleValue;
            case 2:
                return dDoubleValue2 != dDoubleValue;
            case 3:
            case 4:
            case 5:
                NS0.error$default("Attempted to use an invalid operator with a numeric value: " + operator, null, 2, null);
                return false;
            case 6:
                return dDoubleValue2 < dDoubleValue;
            case 7:
                return dDoubleValue2 > dDoubleValue;
            case 8:
                return dDoubleValue2 < dDoubleValue || dDoubleValue2 == dDoubleValue;
            case 9:
                return dDoubleValue2 > dDoubleValue || dDoubleValue2 == dDoubleValue;
            default:
                throw new C6489s51();
        }
    }

    private final boolean triggerMatchesNumericValueFlex(Number triggerValue, String deviceValue, C4340i52.b operator) {
        try {
            return triggerMatchesNumericValue(Double.valueOf(triggerValue.doubleValue()), Double.valueOf(Double.parseDouble(deviceValue)), operator);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private final boolean triggerMatchesStringValue(String triggerValue, String deviceValue, C4340i52.b operator) {
        int i = a.$EnumSwitchMapping$0[operator.ordinal()];
        if (i == 1) {
            return Intrinsics.a(triggerValue, deviceValue);
        }
        if (i == 2) {
            return !Intrinsics.a(triggerValue, deviceValue);
        }
        NS0.error$default("Attempted to use an invalid operator for a string trigger comparison: " + operator, null, 2, null);
        return false;
    }

    @Override // defpackage.InterfaceC4980kv0
    public boolean evaluateMessageTriggers(@NotNull C1881Qw0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.getTriggers().isEmpty()) {
            return true;
        }
        Iterator<List<C4340i52>> it = message.getTriggers().iterator();
        while (it.hasNext()) {
            if (evaluateAndTriggers(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC4980kv0, defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this._dynamicTriggerController.getHasSubscribers();
    }

    @NotNull
    public final ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    @Override // defpackage.InterfaceC4980kv0
    public boolean isTriggerOnMessage(@NotNull C1881Qw0 message, @NotNull Collection<String> triggersKeys) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(triggersKeys, "triggersKeys");
        if (message.getTriggers() == null) {
            return false;
        }
        for (String str : triggersKeys) {
            Iterator<List<C4340i52>> it = message.getTriggers().iterator();
            while (it.hasNext()) {
                for (C4340i52 c4340i52 : it.next()) {
                    if (Intrinsics.a(str, c4340i52.getProperty()) || Intrinsics.a(str, c4340i52.getTriggerId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC4980kv0
    public boolean messageHasOnlyDynamicTriggers(@NotNull C1881Qw0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.getTriggers() == null || message.getTriggers().isEmpty()) {
            return false;
        }
        Iterator<List<C4340i52>> it = message.getTriggers().iterator();
        while (it.hasNext()) {
            for (C4340i52 c4340i52 : it.next()) {
                if (c4340i52.getKind() == C4340i52.a.CUSTOM || c4340i52.getKind() == C4340i52.a.UNKNOWN) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC7286vt0
    public void onModelUpdated(@NotNull H01 args, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        D01 model = args.getModel();
        Intrinsics.c(model, "null cannot be cast to non-null type com.onesignal.inAppMessages.internal.triggers.TriggerModel");
        C4808k52 c4808k52 = (C4808k52) model;
        addTriggers(c4808k52.getKey(), c4808k52.getValue());
        this._dynamicTriggerController.getEvents().fire(new c(c4808k52));
    }

    @Override // defpackage.InterfaceC7286vt0
    public void onModelAdded(@NotNull C4808k52 model, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        addTriggers(model.getKey(), model.getValue());
        this._dynamicTriggerController.getEvents().fire(new b(model));
    }

    @Override // defpackage.InterfaceC7286vt0
    public void onModelRemoved(@NotNull C4808k52 model, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        removeTriggersForKeys(model.getKey());
    }

    @Override // defpackage.InterfaceC4980kv0, defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC5190lv0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this._dynamicTriggerController.subscribe(handler);
    }

    @Override // defpackage.InterfaceC4980kv0, defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC5190lv0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this._dynamicTriggerController.unsubscribe(handler);
    }
}
