package defpackage;

import android.content.ContentValues;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: Da1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u00020\u001c2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010%J\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0(H\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010%J/\u0010/\u001a\b\u0012\u0004\u0012\u00020-0(2\u0006\u0010,\u001a\u00020\u000b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0(H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u00020\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"LDa1;", "Llu0;", "Lus0;", "_databaseProvider", "<init>", "(Lus0;)V", "LQz0;", "notificationInfluenceType", "LFa1;", "directSourceBody", "indirectSourceBody", "", "notificationIds", "LEa1;", "getNotificationInfluenceSource", "(LQz0;LFa1;LFa1;Ljava/lang/String;)LEa1;", "iamInfluenceType", "iamIds", Payload.SOURCE, "getIAMInfluenceSource", "(LQz0;LFa1;LFa1;Ljava/lang/String;LEa1;)LEa1;", "", "Lvx;", "cachedUniqueOutcomes", "Lorg/json/JSONArray;", "channelIds", "LKz0;", "channel", "", "addIdToListFromChannel", "(Ljava/util/List;Lorg/json/JSONArray;LKz0;)V", "sourceBody", "addIdsToListFromSource", "(Ljava/util/List;LFa1;)V", "Lza1;", "event", "deleteOldOutcomeEvent", "(Lza1;LJM;)Ljava/lang/Object;", "eventParams", "saveOutcomeEvent", "", "getAllEventsToSend", "(LJM;)Ljava/lang/Object;", "saveUniqueOutcomeEventParams", AppMeasurementSdk.ConditionalUserProperty.NAME, "LJz0;", "influences", "getNotCachedUniqueInfluencesForOutcome", "(Ljava/lang/String;Ljava/util/List;LJM;)Ljava/lang/Object;", "cleanCachedUniqueOutcomeEventNotifications", "Lus0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C0800Da1 implements InterfaceC5187lu0 {

    @NotNull
    private final InterfaceC7073us0 _databaseProvider;

    /* JADX INFO: renamed from: Da1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1890Qz0.values().length];
            iArr[EnumC1890Qz0.DIRECT.ordinal()] = 1;
            iArr[EnumC1890Qz0.INDIRECT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: Da1$b */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$cleanCachedUniqueOutcomeEventNotifications$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ String $notificationIdColumnName;
        final /* synthetic */ String $notificationTableName;
        int label;
        final /* synthetic */ C0800Da1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, C0800Da1 c0800Da1, JM<? super b> jm) {
            super(2, jm);
            this.$notificationTableName = str;
            this.$notificationIdColumnName = str2;
            this.this$0 = c0800Da1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new b(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            StringBuilder sb = new StringBuilder("NOT EXISTS(SELECT NULL FROM ");
            sb.append(this.$notificationTableName);
            sb.append(" n WHERE n.");
            sb.append(this.$notificationIdColumnName);
            sb.append(" = channel_influence_id AND channel_type = \"");
            String nameValue = EnumC1420Kz0.NOTIFICATION.getNameValue();
            Locale locale = Locale.ROOT;
            this.this$0._databaseProvider.getOs().delete("cached_unique_outcome", C5807oq.b(sb, C4564j.g(locale, "ROOT", nameValue, locale, "this as java.lang.String).toLowerCase(locale)"), "\")"), null);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Da1$c */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$deleteOldOutcomeEvent$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C8058za1 $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C8058za1 c8058za1, JM<? super c> jm) {
            super(2, jm);
            this.$event = c8058za1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C0800Da1.this.new c(this.$event, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            C0800Da1.this._databaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Da1$d */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository", f = "OutcomeEventsRepository.kt", l = {104}, m = "getAllEventsToSend")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(JM<? super d> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C0800Da1.this.getAllEventsToSend(this);
        }
    }

    /* JADX INFO: renamed from: Da1$e */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getAllEventsToSend$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ List<C8058za1> $events;
        int label;

        /* JADX INFO: renamed from: Da1$e$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "cursor", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ List<C8058za1> $events;
            final /* synthetic */ C0800Da1 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0800Da1 c0800Da1, List<C8058za1> list) {
                super(1);
                this.this$0 = c0800Da1;
                this.$events = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 cursor) {
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString("notification_influence_type");
                        EnumC1890Qz0.Companion companion = EnumC1890Qz0.INSTANCE;
                        EnumC1890Qz0 enumC1890Qz0FromString = companion.fromString(string);
                        EnumC1890Qz0 enumC1890Qz0FromString2 = companion.fromString(cursor.getString("iam_influence_type"));
                        String optString = cursor.getOptString(C1575Mz0.NOTIFICATIONS_IDS);
                        if (optString == null) {
                            optString = "[]";
                        }
                        String optString2 = cursor.getOptString("iam_ids");
                        String str = optString2 == null ? "[]" : optString2;
                        String string2 = cursor.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                        float f = cursor.getFloat("weight");
                        long j = cursor.getLong("timestamp");
                        long j2 = cursor.getLong("session_time");
                        try {
                            C0956Fa1 c0956Fa1 = new C0956Fa1(null, null, 3, null);
                            C0956Fa1 c0956Fa2 = new C0956Fa1(null, null, 3, null);
                            C0878Ea1 notificationInfluenceSource = this.this$0.getNotificationInfluenceSource(enumC1890Qz0FromString, c0956Fa1, c0956Fa2, optString);
                            this.this$0.getIAMInfluenceSource(enumC1890Qz0FromString2, c0956Fa1, c0956Fa2, str, notificationInfluenceSource);
                            if (notificationInfluenceSource == null) {
                                notificationInfluenceSource = new C0878Ea1(null, null);
                            }
                            this.$events.add(new C8058za1(string2, notificationInfluenceSource, f, j2, j));
                        } catch (JSONException e) {
                            NS0.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e);
                        }
                    } while (cursor.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<C8058za1> list, JM<? super e> jm) {
            super(2, jm);
            this.$events = list;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C0800Da1.this.new e(this.$events, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            C1163Hr1.INSTANCE.run(C0800Da1.this._databaseProvider);
            InterfaceC6863ts0.a.query$default(C0800Da1.this._databaseProvider.getOs(), "outcome", null, null, null, null, null, null, null, new a(C0800Da1.this, this.$events), 254, null);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Da1$f */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository", f = "OutcomeEventsRepository.kt", l = {286}, m = "getNotCachedUniqueInfluencesForOutcome")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(JM<? super f> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C0800Da1.this.getNotCachedUniqueInfluencesForOutcome(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Da1$g */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class g extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ List<C1342Jz0> $influences;
        final /* synthetic */ String $name;
        final /* synthetic */ List<C1342Jz0> $uniqueInfluences;
        int label;
        final /* synthetic */ C0800Da1 this$0;

        /* JADX INFO: renamed from: Da1$g$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ JSONArray $availableInfluenceIds;
            final /* synthetic */ String $channelInfluenceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(JSONArray jSONArray, String str) {
                super(1);
                this.$availableInfluenceIds = jSONArray;
                this.$channelInfluenceId = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getCount() == 0) {
                    this.$availableInfluenceIds.put(this.$channelInfluenceId);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<C1342Jz0> list, String str, C0800Da1 c0800Da1, List<C1342Jz0> list2, JM<? super g> jm) {
            super(2, jm);
            this.$influences = list;
            this.$name = str;
            this.this$0 = c0800Da1;
            this.$uniqueInfluences = list2;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new g(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((g) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            try {
                for (C1342Jz0 c1342Jz0 : this.$influences) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray ids = c1342Jz0.getIds();
                    if (ids != null) {
                        int length = ids.length();
                        for (int i = 0; i < length; i++) {
                            String string = ids.getString(i);
                            InterfaceC6863ts0.a.query$default(this.this$0._databaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, c1342Jz0.getInfluenceChannel().getNameValue(), this.$name}, null, null, null, "1", new a(jSONArray, string), 112, null);
                        }
                        if (jSONArray.length() > 0) {
                            C1342Jz0 c1342Jz0Copy = c1342Jz0.copy();
                            c1342Jz0Copy.setIds(jSONArray);
                            this.$uniqueInfluences.add(c1342Jz0Copy);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Da1$h */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$saveOutcomeEvent$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "Landroid/content/ContentValues;", "<anonymous>", "(LKN;)Landroid/content/ContentValues;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends AW1 implements Function2<KN, JM<? super ContentValues>, Object> {
        final /* synthetic */ C8058za1 $eventParams;
        int label;
        final /* synthetic */ C0800Da1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C8058za1 c8058za1, C0800Da1 c0800Da1, JM<? super h> jm) {
            super(2, jm);
            this.$eventParams = c8058za1;
            this.this$0 = c0800Da1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new h(this.$eventParams, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super ContentValues> jm) {
            return ((h) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, org.json.JSONArray] */
        /* JADX WARN: Type inference failed for: r1v0, types: [T, org.json.JSONArray] */
        /* JADX WARN: Type inference failed for: r2v0, types: [Qz0, T] */
        /* JADX WARN: Type inference failed for: r2v7, types: [T, org.json.JSONArray] */
        /* JADX WARN: Type inference failed for: r2v9, types: [T, org.json.JSONArray] */
        /* JADX WARN: Type inference failed for: r4v1, types: [T, org.json.JSONArray] */
        /* JADX WARN: Type inference failed for: r4v3, types: [Qz0, T] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, org.json.JSONArray] */
        /* JADX WARN: Type inference failed for: r4v6, types: [Qz0, T] */
        /* JADX WARN: Type inference failed for: r5v3, types: [Qz0, T] */
        /* JADX WARN: Type inference failed for: r5v5, types: [Qz0, T] */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C0956Fa1 indirectBody;
            C0956Fa1 directBody;
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C3027bp1 c3027bp1B = C4564j.b(obj);
            c3027bp1B.d = new JSONArray();
            C3027bp1 c3027bp1 = new C3027bp1();
            c3027bp1.d = new JSONArray();
            C3027bp1 c3027bp2 = new C3027bp1();
            ?? r2 = EnumC1890Qz0.UNATTRIBUTED;
            c3027bp2.d = r2;
            C3027bp1 c3027bp3 = new C3027bp1();
            c3027bp3.d = r2;
            C0878Ea1 outcomeSource = this.$eventParams.getOutcomeSource();
            if (outcomeSource != null && (directBody = outcomeSource.getDirectBody()) != null) {
                ?? notificationIds = directBody.getNotificationIds();
                if (notificationIds != 0 && notificationIds.length() > 0) {
                    c3027bp2.d = EnumC1890Qz0.DIRECT;
                    c3027bp1B.d = notificationIds;
                }
                ?? inAppMessagesIds = directBody.getInAppMessagesIds();
                if (inAppMessagesIds != 0 && inAppMessagesIds.length() > 0) {
                    c3027bp3.d = EnumC1890Qz0.DIRECT;
                    c3027bp1.d = inAppMessagesIds;
                }
            }
            C0878Ea1 outcomeSource2 = this.$eventParams.getOutcomeSource();
            if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
                ?? notificationIds2 = indirectBody.getNotificationIds();
                if (notificationIds2 != 0 && notificationIds2.length() > 0) {
                    c3027bp2.d = EnumC1890Qz0.INDIRECT;
                    c3027bp1B.d = notificationIds2;
                }
                ?? inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
                if (inAppMessagesIds2 != 0 && inAppMessagesIds2.length() > 0) {
                    c3027bp3.d = EnumC1890Qz0.INDIRECT;
                    c3027bp1.d = inAppMessagesIds2;
                }
            }
            ContentValues contentValues = new ContentValues();
            C8058za1 c8058za1 = this.$eventParams;
            contentValues.put(C1575Mz0.NOTIFICATIONS_IDS, ((JSONArray) c3027bp1B.d).toString());
            contentValues.put("iam_ids", ((JSONArray) c3027bp1.d).toString());
            String string = ((EnumC1890Qz0) c3027bp2.d).toString();
            Locale ROOT = Locale.ROOT;
            contentValues.put("notification_influence_type", C4564j.g(ROOT, "ROOT", string, ROOT, "this as java.lang.String).toLowerCase(locale)"));
            String string2 = ((EnumC1890Qz0) c3027bp3.d).toString();
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = string2.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            contentValues.put("iam_influence_type", lowerCase);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, c8058za1.getOutcomeId());
            contentValues.put("weight", new Float(c8058za1.getWeight()));
            contentValues.put("timestamp", new Long(c8058za1.getTimestamp()));
            contentValues.put("session_time", new Long(c8058za1.getSessionTime()));
            this.this$0._databaseProvider.getOs().insert("outcome", null, contentValues);
            return contentValues;
        }
    }

    /* JADX INFO: renamed from: Da1$i */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$saveUniqueOutcomeEventParams$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class i extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C8058za1 $eventParams;
        int label;
        final /* synthetic */ C0800Da1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C8058za1 c8058za1, C0800Da1 c0800Da1, JM<? super i> jm) {
            super(2, jm);
            this.$eventParams = c8058za1;
            this.this$0 = c0800Da1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new i(this.$eventParams, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((i) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            String outcomeId = this.$eventParams.getOutcomeId();
            ArrayList<C7297vx> arrayList = new ArrayList();
            C0878Ea1 outcomeSource = this.$eventParams.getOutcomeSource();
            C0956Fa1 directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
            C0878Ea1 outcomeSource2 = this.$eventParams.getOutcomeSource();
            C0956Fa1 indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
            this.this$0.addIdsToListFromSource(arrayList, directBody);
            this.this$0.addIdsToListFromSource(arrayList, indirectBody);
            for (C7297vx c7297vx : arrayList) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", c7297vx.getInfluenceId());
                contentValues.put("channel_type", c7297vx.getChannel().getNameValue());
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, outcomeId);
                this.this$0._databaseProvider.getOs().insert("cached_unique_outcome", null, contentValues);
            }
            return Unit.a;
        }
    }

    public C0800Da1(@NotNull InterfaceC7073us0 _databaseProvider) {
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        this._databaseProvider = _databaseProvider;
    }

    private final void addIdToListFromChannel(List<C7297vx> cachedUniqueOutcomes, JSONArray channelIds, EnumC1420Kz0 channel) {
        if (channelIds != null) {
            int length = channelIds.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String influenceId = channelIds.getString(i2);
                    Intrinsics.checkNotNullExpressionValue(influenceId, "influenceId");
                    cachedUniqueOutcomes.add(new C7297vx(influenceId, channel));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<C7297vx> cachedUniqueOutcomes, C0956Fa1 sourceBody) {
        if (sourceBody != null) {
            JSONArray inAppMessagesIds = sourceBody.getInAppMessagesIds();
            JSONArray notificationIds = sourceBody.getNotificationIds();
            addIdToListFromChannel(cachedUniqueOutcomes, inAppMessagesIds, EnumC1420Kz0.IAM);
            addIdToListFromChannel(cachedUniqueOutcomes, notificationIds, EnumC1420Kz0.NOTIFICATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0878Ea1 getIAMInfluenceSource(EnumC1890Qz0 iamInfluenceType, C0956Fa1 directSourceBody, C0956Fa1 indirectSourceBody, String iamIds, C0878Ea1 source) {
        C0878Ea1 directBody;
        C0878Ea1 indirectBody;
        int i2 = a.$EnumSwitchMapping$0[iamInfluenceType.ordinal()];
        if (i2 == 1) {
            directSourceBody.setInAppMessagesIds(new JSONArray(iamIds));
            return (source == null || (directBody = source.setDirectBody(directSourceBody)) == null) ? new C0878Ea1(directSourceBody, null) : directBody;
        }
        if (i2 != 2) {
            return source;
        }
        indirectSourceBody.setInAppMessagesIds(new JSONArray(iamIds));
        return (source == null || (indirectBody = source.setIndirectBody(indirectSourceBody)) == null) ? new C0878Ea1(null, indirectSourceBody) : indirectBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0878Ea1 getNotificationInfluenceSource(EnumC1890Qz0 notificationInfluenceType, C0956Fa1 directSourceBody, C0956Fa1 indirectSourceBody, String notificationIds) {
        int i2 = a.$EnumSwitchMapping$0[notificationInfluenceType.ordinal()];
        if (i2 == 1) {
            directSourceBody.setNotificationIds(new JSONArray(notificationIds));
            return new C0878Ea1(directSourceBody, null);
        }
        if (i2 != 2) {
            return null;
        }
        indirectSourceBody.setNotificationIds(new JSONArray(notificationIds));
        return new C0878Ea1(null, indirectSourceBody);
    }

    @Override // defpackage.InterfaceC5187lu0
    @Nullable
    public Object cleanCachedUniqueOutcomeEventNotifications(@NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new b("notification", C1575Mz0.NOTIFICATION_ID_TAG, this, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    @Override // defpackage.InterfaceC5187lu0
    @Nullable
    public Object deleteOldOutcomeEvent(@NotNull C8058za1 c8058za1, @NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new c(c8058za1, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC5187lu0
    @Nullable
    public Object getAllEventsToSend(@NotNull JM<? super List<C8058za1>> jm) {
        d dVar;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        Object obj = dVar.result;
        MN mn = MN.d;
        int i3 = dVar.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) dVar.L$0;
            C1795Pt1.b(obj);
            return list;
        }
        C1795Pt1.b(obj);
        ArrayList arrayList = new ArrayList();
        ExecutorC7200vV executorC7200vV = C6266r20.c;
        e eVar = new e(arrayList, null);
        dVar.L$0 = arrayList;
        dVar.label = 1;
        return C5189lv.p(executorC7200vV, eVar, dVar) == mn ? mn : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC5187lu0
    @Nullable
    public Object getNotCachedUniqueInfluencesForOutcome(@NotNull String str, @NotNull List<C1342Jz0> list, @NotNull JM<? super List<C1342Jz0>> jm) {
        f fVar;
        if (jm instanceof f) {
            fVar = (f) jm;
            int i2 = fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.label = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(jm);
            }
        } else {
            fVar = new f(jm);
        }
        Object obj = fVar.result;
        MN mn = MN.d;
        int i3 = fVar.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) fVar.L$0;
            C1795Pt1.b(obj);
            return list2;
        }
        C1795Pt1.b(obj);
        ArrayList arrayList = new ArrayList();
        ExecutorC7200vV executorC7200vV = C6266r20.c;
        g gVar = new g(list, str, this, arrayList, null);
        fVar.L$0 = arrayList;
        fVar.label = 1;
        return C5189lv.p(executorC7200vV, gVar, fVar) == mn ? mn : arrayList;
    }

    @Override // defpackage.InterfaceC5187lu0
    @Nullable
    public Object saveOutcomeEvent(@NotNull C8058za1 c8058za1, @NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new h(c8058za1, this, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    @Override // defpackage.InterfaceC5187lu0
    @Nullable
    public Object saveUniqueOutcomeEventParams(@NotNull C8058za1 c8058za1, @NotNull JM<? super Unit> jm) throws Throwable {
        NS0.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + c8058za1 + ')', null, 2, null);
        Object objP = C5189lv.p(C6266r20.c, new i(c8058za1, this, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }
}
