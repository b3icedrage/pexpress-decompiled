package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CoderResult;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", l = {68, 72, 72, 78, 78, 82, 90, 116, 121}, m = "invokeSuspend")
public final class C5314mW extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<C5601nr0, C2250Vp0>, C5601nr0, JM<? super Unit>, Object> {
    public KN d;
    public A62 e;
    public int g;
    public /* synthetic */ AbstractC1121Hd1 h;
    public /* synthetic */ Object i;

    /* JADX INFO: renamed from: mW$a */
    @InterfaceC3368dU(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", l = {100}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC5583nl2, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ Object g;
        public final /* synthetic */ AbstractC5391mr0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, AbstractC5391mr0 abstractC5391mr0, JM<? super a> jm) {
            super(2, jm);
            this.g = obj;
            this.h = abstractC5391mr0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            a aVar = new a(this.g, this.h, jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC5583nl2 interfaceC5583nl2, JM<? super Unit> jm) {
            return ((a) create(interfaceC5583nl2, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            AbstractC5391mr0 abstractC5391mr0 = this.h;
            try {
                if (i != 0) {
                    try {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1795Pt1.b(obj);
                    } catch (Throwable th) {
                        C6231qr0.b(abstractC5391mr0);
                        throw th;
                    }
                } else {
                    C1795Pt1.b(obj);
                    InterfaceC5583nl2 interfaceC5583nl2 = (InterfaceC5583nl2) this.e;
                    InterfaceC0942Ew interfaceC0942Ew = (InterfaceC0942Ew) this.g;
                    InterfaceC6245qw interfaceC6245qwI0 = interfaceC5583nl2.i0();
                    this.d = 1;
                    if (C3686f.h(interfaceC0942Ew, interfaceC6245qwI0, this) == mn) {
                        return mn;
                    }
                }
                C6231qr0.b(abstractC5391mr0);
                return Unit.a;
            } catch (CancellationException e) {
                LN.c(abstractC5391mr0, e);
                throw e;
            } catch (Throwable th2) {
                CancellationException cancellationException = new CancellationException("Receive failed");
                cancellationException.initCause(th2);
                LN.c(abstractC5391mr0, cancellationException);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: mW$b */
    public static final class b extends ML0 implements Function1<Throwable, Unit> {
        public final /* synthetic */ C2684aG0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2684aG0 c2684aG0) {
            super(1);
            this.d = c2684aG0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            this.d.X();
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fe A[Catch: all -> 0x02eb, TRY_LEAVE, TryCatch #8 {all -> 0x02eb, blocks: (B:99:0x02e6, B:103:0x02f2, B:107:0x02fe), top: B:387:0x02e6 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x030a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0311  */
    /* JADX WARN: Code duplicated, block: B:123:0x0332  */
    /* JADX WARN: Code duplicated, block: B:125:0x033a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x033c  */
    /* JADX WARN: Code duplicated, block: B:127:0x034c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0354  */
    /* JADX WARN: Code duplicated, block: B:131:0x0372 A[LOOP:0: B:381:0x022f->B:131:0x0372, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0382  */
    /* JADX WARN: Code duplicated, block: B:139:0x0389  */
    /* JADX WARN: Code duplicated, block: B:142:0x0399  */
    /* JADX WARN: Code duplicated, block: B:143:0x039f  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c4 A[Catch: all -> 0x03e3, TryCatch #1 {all -> 0x03e3, blocks: (B:150:0x03b7, B:152:0x03c4, B:158:0x03db, B:155:0x03cf, B:161:0x03e7), top: B:373:0x03b7 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:155:0x03cf A[Catch: all -> 0x03e3, TryCatch #1 {all -> 0x03e3, blocks: (B:150:0x03b7, B:152:0x03c4, B:158:0x03db, B:155:0x03cf, B:161:0x03e7), top: B:373:0x03b7 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x03db A[Catch: all -> 0x03e3, LOOP:5: B:149:0x03b5->B:158:0x03db, LOOP_END, TryCatch #1 {all -> 0x03e3, blocks: (B:150:0x03b7, B:152:0x03c4, B:158:0x03db, B:155:0x03cf, B:161:0x03e7), top: B:373:0x03b7 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:168:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:170:0x0400  */
    /* JADX WARN: Code duplicated, block: B:171:0x0405  */
    /* JADX WARN: Code duplicated, block: B:178:0x041a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0428  */
    /* JADX WARN: Code duplicated, block: B:181:0x0430  */
    /* JADX WARN: Code duplicated, block: B:187:0x044e A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0462 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0464 A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0467  */
    /* JADX WARN: Code duplicated, block: B:193:0x046a A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0486  */
    /* JADX WARN: Code duplicated, block: B:204:0x04a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:214:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:215:0x04d0 A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:217:0x04db A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:219:0x04df A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:222:0x04e7 A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:226:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:227:0x0502  */
    /* JADX WARN: Code duplicated, block: B:229:0x0507 A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0510  */
    /* JADX WARN: Code duplicated, block: B:232:0x0513 A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:234:0x051d A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0526  */
    /* JADX WARN: Code duplicated, block: B:237:0x052b A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:185:0x043d, B:187:0x044e, B:190:0x0464, B:195:0x0474, B:193:0x046a, B:202:0x048c, B:203:0x04a2, B:208:0x04aa, B:210:0x04ae, B:211:0x04b9, B:213:0x04bf, B:215:0x04d0, B:217:0x04db, B:219:0x04df, B:224:0x04f2, B:222:0x04e7, B:229:0x0507, B:234:0x051d, B:242:0x053c, B:237:0x052b, B:232:0x0513, B:243:0x0546, B:244:0x0549), top: B:372:0x043d }] */
    /* JADX WARN: Code duplicated, block: B:245:0x054a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0565  */
    /* JADX WARN: Code duplicated, block: B:252:0x0568 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x056b  */
    /* JADX WARN: Code duplicated, block: B:261:0x057d  */
    /* JADX WARN: Code duplicated, block: B:266:0x0593  */
    /* JADX WARN: Code duplicated, block: B:271:0x05a1 A[Catch: all -> 0x058f, TRY_LEAVE, TryCatch #11 {all -> 0x058f, blocks: (B:263:0x058a, B:267:0x0595, B:271:0x05a1), top: B:393:0x058a }] */
    /* JADX WARN: Code duplicated, block: B:274:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:278:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:281:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:283:0x05c2 A[LOOP:1: B:385:0x0433->B:283:0x05c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:287:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:289:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:295:0x0611  */
    /* JADX WARN: Code duplicated, block: B:297:0x0619  */
    /* JADX WARN: Code duplicated, block: B:299:0x0627 A[LOOP:4: B:389:0x03ae->B:299:0x0627, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x0643  */
    /* JADX WARN: Code duplicated, block: B:319:0x0696  */
    /* JADX WARN: Code duplicated, block: B:329:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:330:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:333:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:334:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:343:0x0717  */
    /* JADX WARN: Code duplicated, block: B:344:0x071a  */
    /* JADX WARN: Code duplicated, block: B:347:0x071e  */
    /* JADX WARN: Code duplicated, block: B:35:0x013d  */
    /* JADX WARN: Code duplicated, block: B:369:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x013f  */
    /* JADX WARN: Code duplicated, block: B:372:0x043d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x03b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x040e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x02e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x014a  */
    /* JADX WARN: Code duplicated, block: B:393:0x058a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x05b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x05ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x0546 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x04bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x053a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x0558 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0150  */
    /* JADX WARN: Code duplicated, block: B:413:0x040a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x03da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x017e  */
    /* JADX WARN: Code duplicated, block: B:46:0x018b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0193  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x020f  */
    /* JADX WARN: Code duplicated, block: B:57:0x021b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0226  */
    /* JADX WARN: Code duplicated, block: B:65:0x0241  */
    /* JADX WARN: Code duplicated, block: B:97:0x02de  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x0354, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:347:0x071e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:369:0x07e2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r2v65, types: [A62, KN] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.nio.charset.CharsetDecoder] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v30, types: [boolean] */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        long j;
        int i;
        AbstractC1121Hd1 abstractC1121Hd1;
        A62 a62;
        AbstractC5391mr0 abstractC5391mr0D;
        int i2;
        boolean z;
        MN mn;
        C5601nr0 c5601nr0;
        Object objD;
        AbstractC1121Hd1 abstractC1121Hd2;
        Object objD2;
        Object objK;
        AbstractC1121Hd1 abstractC1121Hd3;
        A62 a63;
        Object objF;
        AbstractC1121Hd1 abstractC1121Hd4;
        AbstractC1121Hd1 abstractC1121Hd5;
        A62 a64;
        Object objF2;
        AbstractC1121Hd1 abstractC1121Hd6;
        A62 a65;
        A62 a66;
        Object objD3;
        AbstractC7769yA0 input;
        long jU;
        AbstractC1121Hd1 abstractC1121Hd7;
        StringBuilder sb;
        C2895bC c2895bCL;
        int i3;
        int i4;
        boolean z2;
        ByteBuffer byteBuffer;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        byte b2;
        int i11;
        char c;
        int i12;
        int i13;
        int i14;
        C2895bC c2895bCL2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        ByteBuffer byteBuffer2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        byte b3;
        int i29;
        int i30;
        ByteBuffer byteBuffer3;
        int i31;
        char c2;
        int i32;
        char c3;
        int i33;
        char c4;
        int i34;
        int i35;
        int i36;
        int i37;
        char c5;
        int i38;
        C2895bC c2895bCM;
        String string;
        int i39;
        ?? NewDecoder;
        String str;
        CharBuffer charBufferAllocate;
        C2895bC c2895bCL3;
        int iPosition;
        int i40;
        ?? r17;
        int i41;
        int i42;
        ?? r12;
        int i43;
        ?? r18;
        int i44;
        C2895bC c2895bCM2;
        int i45;
        int i46;
        CoderResult rc;
        CoderResult rc2;
        AbstractC1121Hd1 abstractC1121Hd8;
        A62 a67;
        Object objD4;
        MN mn2;
        AbstractC1121Hd1 abstractC1121Hd9;
        Object objD5;
        AbstractC1121Hd1 abstractC1121Hd10;
        byte[] bArr;
        String str2;
        Long lValueOf;
        boolean z3;
        Object objD6;
        boolean z4;
        Throwable th = null;
        int i47 = 1;
        MN mn3 = MN.d;
        switch (this.g) {
            case 0:
                j = 0;
                i = -1;
                C1795Pt1.b(obj);
                abstractC1121Hd1 = this.h;
                C5601nr0 c5601nr1 = (C5601nr0) this.i;
                a62 = c5601nr1.a;
                Object obj2 = c5601nr1.b;
                if (!(obj2 instanceof InterfaceC0942Ew)) {
                    return Unit.a;
                }
                abstractC5391mr0D = ((C2250Vp0) abstractC1121Hd1.d).d();
                RI0<?> ri0 = a62.a;
                i2 = 0;
                C2251Vp1 c2251Vp1 = C2017Sp1.a;
                if (!Intrinsics.a(ri0, c2251Vp1.b(Unit.class))) {
                    if (Intrinsics.a(ri0, c2251Vp1.b(Integer.TYPE))) {
                        this.h = abstractC1121Hd1;
                        this.i = a62;
                        this.d = abstractC1121Hd1;
                        this.e = a62;
                        this.g = 2;
                        objF2 = ((InterfaceC0942Ew) obj2).f(Long.MAX_VALUE, this);
                        if (objF2 != mn3) {
                            abstractC1121Hd6 = abstractC1121Hd1;
                            a65 = a62;
                            a66 = a65;
                            input = (AbstractC7769yA0) objF2;
                            if (!input.q()) {
                                abstractC1121Hd7 = abstractC1121Hd1;
                            } else {
                                jU = input.u();
                                if (jU > j) {
                                    abstractC1121Hd7 = abstractC1121Hd1;
                                    if (Api.BaseClientBuilder.API_PRIORITY_OTHER >= jU) {
                                        i39 = (int) jU;
                                        Charset charset = Charsets.UTF_8;
                                        Intrinsics.checkNotNullParameter(input, "<this>");
                                        Intrinsics.checkNotNullParameter(charset, "charset");
                                        NewDecoder = charset.newDecoder();
                                        Intrinsics.checkNotNullExpressionValue(NewDecoder, "charset.newDecoder()");
                                        CharBuffer charBuffer = C6927uA.a;
                                        Intrinsics.checkNotNullParameter(NewDecoder, "<this>");
                                        Intrinsics.checkNotNullParameter(input, "input");
                                        if (i39 == 0) {
                                            str = "buffer";
                                            if (input.i - input.h >= i39) {
                                                th = null;
                                                charBufferAllocate = CharBuffer.allocate(i39);
                                                c2895bCL3 = C5189lv.l(input, 1);
                                                if (c2895bCL3 == null) {
                                                    iPosition = i39;
                                                    i40 = 1;
                                                    mn3 = mn3;
                                                    i46 = i2;
                                                } else {
                                                    iPosition = i39;
                                                    int i48 = 1;
                                                    i40 = 1;
                                                    r17 = i2;
                                                    while (true) {
                                                        try {
                                                            i42 = c2895bCL3.c - c2895bCL3.b;
                                                            if (i42 >= i47) {
                                                                try {
                                                                    if (!charBufferAllocate.hasRemaining() && iPosition != 0) {
                                                                        ByteBuffer byteBuffer4 = c2895bCL3.a;
                                                                        int i49 = c2895bCL3.b;
                                                                        int i50 = c2895bCL3.c - i49;
                                                                        ByteBuffer byteBuffer5 = WY0.a;
                                                                        ByteBuffer byteBufferP = C6621sj.p(byteBuffer4, i49, i50);
                                                                        Intrinsics.checkNotNullParameter(byteBufferP, str);
                                                                        int iLimit = byteBufferP.limit();
                                                                        int iPosition2 = byteBufferP.position();
                                                                        ?? r7 = iLimit - iPosition2 >= iPosition ? i40 : i2;
                                                                        if (r7 != 0) {
                                                                            i44 = iPosition;
                                                                            byteBufferP.limit(iPosition2 + i44);
                                                                        } else {
                                                                            i44 = iPosition;
                                                                        }
                                                                        CoderResult rc3 = NewDecoder.decode(byteBufferP, charBufferAllocate, r7);
                                                                        if (rc3.isMalformed() || rc3.isUnmappable()) {
                                                                            Intrinsics.checkNotNullExpressionValue(rc3, "rc");
                                                                            C6927uA.e(rc3);
                                                                        }
                                                                        i48 = (rc3.isUnderflow() && byteBufferP.hasRemaining()) ? i48 + 1 : i40;
                                                                        byteBufferP.limit(iLimit);
                                                                        iPosition = i44 - (byteBufferP.position() - iPosition2);
                                                                        if (byteBufferP.limit() != i50) {
                                                                            throw new IllegalStateException("Buffer's limit change is not allowed");
                                                                        }
                                                                        c2895bCL3.c(byteBufferP.position());
                                                                        r12 = r7;
                                                                        i43 = i48;
                                                                        th = th;
                                                                        i41 = i40;
                                                                        if (i41 != 0) {
                                                                            C5189lv.f(input, c2895bCL3);
                                                                        }
                                                                        throw th;
                                                                    }
                                                                    int i51 = iPosition;
                                                                    r12 = r17 == true ? 1 : 0;
                                                                    iPosition = i51;
                                                                    i43 = i2;
                                                                    try {
                                                                        r18 = r12;
                                                                        i42 = c2895bCL3.c - c2895bCL3.b;
                                                                        i47 = i43;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        i41 = i40;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    throw th3;
                                                                }
                                                            } else {
                                                                str = str;
                                                                mn3 = mn3;
                                                                r18 = r17;
                                                            }
                                                            if (i42 == 0) {
                                                                try {
                                                                    c2895bCM2 = C5189lv.m(input, c2895bCL3);
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    i41 = i2;
                                                                }
                                                                break;
                                                            } else if (i42 >= i47 || c2895bCL3.f - c2895bCL3.e < 8) {
                                                                C5189lv.f(input, c2895bCL3);
                                                                c2895bCM2 = C5189lv.l(input, i47);
                                                            } else {
                                                                c2895bCM2 = c2895bCL3;
                                                            }
                                                            if (c2895bCM2 == null) {
                                                                i45 = i2;
                                                            } else {
                                                                c2895bCL3 = c2895bCM2;
                                                                if (i47 <= 0) {
                                                                    i45 = i40;
                                                                } else {
                                                                    str = str;
                                                                    mn3 = mn3;
                                                                    i40 = 1;
                                                                    r17 = r18;
                                                                }
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            i41 = 1;
                                                        }
                                                    }
                                                    if (i45 != 0) {
                                                        C5189lv.f(input, c2895bCL3);
                                                    }
                                                    i46 = r18 == true ? 1 : 0;
                                                }
                                                if (charBufferAllocate.hasRemaining() && i46 == 0) {
                                                    rc = NewDecoder.decode(C6927uA.b, charBufferAllocate, i40);
                                                    if (rc.isMalformed() || rc.isUnmappable()) {
                                                        Intrinsics.checkNotNullExpressionValue(rc, "rc");
                                                        C6927uA.e(rc);
                                                    }
                                                }
                                                if (iPosition <= 0) {
                                                    throw new EOFException("Not enough bytes available: had only " + (i39 - iPosition) + " instead of " + i39);
                                                }
                                                if (iPosition >= 0) {
                                                    throw new AssertionError("remainingInputBytes < 0");
                                                }
                                                charBufferAllocate.flip();
                                                string = charBufferAllocate.toString();
                                                Intrinsics.checkNotNullExpressionValue(string, "cb.toString()");
                                                abstractC1121Hd6 = abstractC1121Hd6;
                                                a65 = a65;
                                            } else if (input.g.hasArray()) {
                                                ByteBuffer byteBuffer6 = input.g;
                                                byte[] bArrArray = byteBuffer6.array();
                                                Intrinsics.checkNotNullExpressionValue(bArrArray, "bb.array()");
                                                int iPosition3 = byteBuffer6.position() + byteBuffer6.arrayOffset() + input.t().b;
                                                Charset charset2 = NewDecoder.charset();
                                                Intrinsics.checkNotNullExpressionValue(charset2, "charset()");
                                                String str3 = new String(bArrArray, iPosition3, i39, charset2);
                                                input.c(i39);
                                                abstractC1121Hd7 = abstractC1121Hd7;
                                                string = str3;
                                            } else {
                                                CharBuffer charBufferAllocate2 = CharBuffer.allocate(i39);
                                                ByteBuffer byteBuffer7 = input.g;
                                                int i52 = input.t().b;
                                                ByteBuffer byteBuffer8 = WY0.a;
                                                ByteBuffer buffer = C6621sj.p(byteBuffer7, i52, i39);
                                                Intrinsics.checkNotNullParameter(buffer, "buffer");
                                                rc2 = NewDecoder.decode(buffer, charBufferAllocate2, true);
                                                if (rc2.isMalformed() || rc2.isUnmappable()) {
                                                    Intrinsics.checkNotNullExpressionValue(rc2, "rc");
                                                    C6927uA.e(rc2);
                                                }
                                                charBufferAllocate2.flip();
                                                input.c(buffer.position());
                                                string = charBufferAllocate2.toString();
                                                Intrinsics.checkNotNullExpressionValue(string, "cb.toString()");
                                                abstractC1121Hd7 = abstractC1121Hd7;
                                            }
                                        }
                                        mn3 = mn3;
                                    } else {
                                        abstractC1121Hd7 = abstractC1121Hd7;
                                    }
                                    C5601nr0 c5601nr2 = new C5601nr0(a66, new Integer(Integer.parseInt(string)));
                                    abstractC1121Hd8 = abstractC1121Hd6;
                                    this.h = abstractC1121Hd8;
                                    a67 = a65;
                                    this.i = a67;
                                    ?? r2 = th;
                                    this.d = r2;
                                    this.e = r2;
                                    this.g = 3;
                                    objD4 = abstractC1121Hd7.d(this, c5601nr2);
                                    mn2 = mn3;
                                    if (objD4 == mn2) {
                                        return mn2;
                                    }
                                    abstractC1121Hd9 = abstractC1121Hd8;
                                    c5601nr0 = (C5601nr0) objD4;
                                    abstractC1121Hd1 = abstractC1121Hd9;
                                    a62 = a67;
                                } else {
                                    abstractC1121Hd7 = abstractC1121Hd1;
                                }
                                th = null;
                                mn3 = mn3;
                                sb = new StringBuilder(16);
                                if (input.q()) {
                                    abstractC1121Hd6 = abstractC1121Hd6;
                                    a65 = a65;
                                } else {
                                    c2895bCL = C5189lv.l(input, 1);
                                    if (c2895bCL == null) {
                                        i3 = i2;
                                        i4 = i3;
                                    } else {
                                        i3 = i2;
                                        i4 = i3;
                                        while (true) {
                                            try {
                                                byteBuffer = c2895bCL.a;
                                                i5 = c2895bCL.b;
                                                i6 = c2895bCL.c;
                                                i7 = i5;
                                                while (true) {
                                                    if (i7 < i6) {
                                                        try {
                                                            b2 = byteBuffer.get(i7);
                                                            i11 = b2 & 255;
                                                            i8 = i4;
                                                            if ((b2 & 128) != 128) {
                                                                c = (char) i11;
                                                                if (i3 == Integer.MAX_VALUE) {
                                                                    i12 = i2;
                                                                } else {
                                                                    sb.append(c);
                                                                    i3++;
                                                                    i12 = 1;
                                                                }
                                                                if (i12 == 0) {
                                                                    i7++;
                                                                    i4 = i8;
                                                                }
                                                            }
                                                            c2895bCL.c(i7 - i5);
                                                            i9 = i2;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            z2 = true;
                                                            if (z2) {
                                                                C5189lv.f(input, c2895bCL);
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        i8 = i4;
                                                        c2895bCL.c(i6 - i5);
                                                        i9 = 1;
                                                    }
                                                    if (i9 != 0) {
                                                        i4 = i8;
                                                        i10 = 1;
                                                    } else if (i3 == Integer.MAX_VALUE) {
                                                        i4 = i8;
                                                        i10 = i2;
                                                    } else {
                                                        i10 = i2;
                                                        i4 = 1;
                                                    }
                                                    if (i10 == 0) {
                                                        C5189lv.f(input, c2895bCL);
                                                    } else {
                                                        try {
                                                            c2895bCL = C5189lv.m(input, c2895bCL);
                                                            if (c2895bCL == null) {
                                                                i2 = 0;
                                                                th = null;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            z2 = false;
                                                            if (z2) {
                                                                C5189lv.f(input, c2895bCL);
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                z2 = true;
                                            }
                                        }
                                    }
                                    if (i4 != 0) {
                                        i13 = 0 - i3;
                                        i14 = Api.BaseClientBuilder.API_PRIORITY_OTHER - i3;
                                        c2895bCL2 = C5189lv.l(input, 1);
                                        if (c2895bCL2 == null) {
                                            abstractC1121Hd6 = abstractC1121Hd6;
                                            a65 = a65;
                                            i24 = i2;
                                        } else {
                                            i15 = i2;
                                            i16 = 1;
                                            while (true) {
                                                try {
                                                    i19 = c2895bCL2.c;
                                                    i20 = c2895bCL2.b;
                                                    i21 = i15;
                                                    i22 = i19 - i20;
                                                    if (i22 >= i16) {
                                                        try {
                                                            byteBuffer2 = c2895bCL2.a;
                                                            i23 = i20;
                                                            i24 = i21;
                                                            i25 = i2;
                                                            i26 = i25;
                                                            i27 = i26;
                                                            while (true) {
                                                                if (i23 < i19) {
                                                                    i28 = i19;
                                                                    b3 = byteBuffer2.get(i23);
                                                                    i29 = i23;
                                                                    i30 = b3 & 255;
                                                                    abstractC1121Hd6 = abstractC1121Hd6;
                                                                    byteBuffer3 = byteBuffer2;
                                                                    if ((b3 & 128) == 0) {
                                                                        if (i25 == 0) {
                                                                            i35 = 128;
                                                                            for (i36 = 1; i36 < 7 && (i30 & i35) != 0; i36++) {
                                                                                i30 &= ~i35;
                                                                                i35 >>= 1;
                                                                                i25++;
                                                                            }
                                                                            i37 = i25 - 1;
                                                                            if (i25 > i28 - i29) {
                                                                                c2895bCL2.c(i29 - i23);
                                                                                i17 = 1;
                                                                            } else {
                                                                                i26 = i30;
                                                                                i27 = i25;
                                                                                i25 = i37;
                                                                            }
                                                                        } else {
                                                                            i31 = (i26 << 6) | (b3 & 127);
                                                                            i25--;
                                                                            if (i25 == 0) {
                                                                                i26 = i31;
                                                                            } else if ((i31 >>> 16) == 0) {
                                                                                c4 = (char) i31;
                                                                                if (i24 == i14) {
                                                                                    i34 = i2;
                                                                                } else {
                                                                                    sb.append(c4);
                                                                                    i24++;
                                                                                    i34 = 1;
                                                                                }
                                                                                if (i34 == 0) {
                                                                                    c2895bCL2.c(((i29 - i23) - i27) + 1);
                                                                                    i25 = i;
                                                                                    i17 = 1;
                                                                                } else {
                                                                                    i26 = i2;
                                                                                }
                                                                            } else {
                                                                                if (i31 <= 1114111) {
                                                                                    ED.l(i31);
                                                                                    throw th;
                                                                                }
                                                                                c2 = (char) ((i31 >>> 10) + 55232);
                                                                                if (i24 == i14) {
                                                                                    i32 = i2;
                                                                                } else {
                                                                                    sb.append(c2);
                                                                                    i24++;
                                                                                    i32 = 1;
                                                                                }
                                                                                if (i32 != 0) {
                                                                                    c3 = (char) ((i31 & 1023) + 56320);
                                                                                    if (i24 == i14) {
                                                                                        i33 = i2;
                                                                                    } else {
                                                                                        sb.append(c3);
                                                                                        i24++;
                                                                                        i33 = 1;
                                                                                    }
                                                                                    if (i33 == 0) {
                                                                                    }
                                                                                    i26 = i2;
                                                                                }
                                                                                c2895bCL2.c(((i29 - i23) - i27) + 1);
                                                                                i25 = i;
                                                                                i17 = 1;
                                                                            }
                                                                        }
                                                                        i23 = i29 + 1;
                                                                        abstractC1121Hd6 = abstractC1121Hd6;
                                                                        i19 = i28;
                                                                        byteBuffer2 = byteBuffer3;
                                                                    } else {
                                                                        if (i25 == 0) {
                                                                            throw new C3794fW0("Expected " + i25 + " more character bytes");
                                                                        }
                                                                        c5 = (char) i30;
                                                                        if (i24 == i14) {
                                                                            i38 = i2;
                                                                        } else {
                                                                            sb.append(c5);
                                                                            i24++;
                                                                            i38 = 1;
                                                                        }
                                                                        if (i38 == 0) {
                                                                            c2895bCL2.c(i29 - i23);
                                                                            i25 = i;
                                                                            i17 = 1;
                                                                        } else {
                                                                            i23 = i29 + 1;
                                                                            abstractC1121Hd6 = abstractC1121Hd6;
                                                                            i19 = i28;
                                                                            byteBuffer2 = byteBuffer3;
                                                                        }
                                                                    }
                                                                } else {
                                                                    abstractC1121Hd6 = abstractC1121Hd6;
                                                                    i17 = 1;
                                                                    try {
                                                                        c2895bCL2.c(i22);
                                                                        i25 = i2;
                                                                    } catch (Throwable th9) {
                                                                        throw th9;
                                                                    }
                                                                }
                                                                if (i25 == 0) {
                                                                    i25 = i17;
                                                                } else if (i25 <= 0) {
                                                                    i25 = i2;
                                                                }
                                                                try {
                                                                    i22 = c2895bCL2.c - c2895bCL2.b;
                                                                    i16 = i25;
                                                                } catch (Throwable th10) {
                                                                    th = th10;
                                                                    i18 = i17;
                                                                    if (i18 != 0) {
                                                                        C5189lv.f(input, c2895bCL2);
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th11) {
                                                            throw th11;
                                                        }
                                                    } else {
                                                        abstractC1121Hd6 = abstractC1121Hd6;
                                                        i17 = 1;
                                                        i24 = i21;
                                                    }
                                                    if (i22 == 0) {
                                                        try {
                                                            c2895bCM = C5189lv.m(input, c2895bCL2);
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            i18 = i2;
                                                            if (i18 != 0) {
                                                                C5189lv.f(input, c2895bCL2);
                                                            }
                                                            throw th;
                                                        }
                                                        break;
                                                    } else if (i22 >= i16 || c2895bCL2.f - c2895bCL2.e < 8) {
                                                        C5189lv.f(input, c2895bCL2);
                                                        c2895bCM = C5189lv.l(input, i16);
                                                    } else {
                                                        c2895bCM = c2895bCL2;
                                                    }
                                                    if (c2895bCM == null) {
                                                        c2895bCL2 = c2895bCM;
                                                        if (i16 <= 0) {
                                                            i2 = i17;
                                                        } else {
                                                            i15 = i24;
                                                            abstractC1121Hd6 = abstractC1121Hd6;
                                                            a65 = a65;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    i17 = 1;
                                                }
                                            }
                                            if (i2 != 0) {
                                                C5189lv.f(input, c2895bCL2);
                                            }
                                        }
                                        if (i24 < i13) {
                                            throw new C3794fW0(C4564j.c(i13, i24, "Premature end of stream: expected at least ", " chars but had only "));
                                        }
                                    } else {
                                        abstractC1121Hd6 = abstractC1121Hd6;
                                        a65 = a65;
                                        if (i3 < 0) {
                                            throw new C3794fW0(C4564j.c(i2, i3, "Premature end of stream: expected at least ", " chars but had only "));
                                        }
                                    }
                                }
                                string = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
                                C5601nr0 c5601nr3 = new C5601nr0(a66, new Integer(Integer.parseInt(string)));
                                abstractC1121Hd8 = abstractC1121Hd6;
                                this.h = abstractC1121Hd8;
                                a67 = a65;
                                this.i = a67;
                                ?? r3 = th;
                                this.d = r3;
                                this.e = r3;
                                this.g = 3;
                                objD4 = abstractC1121Hd7.d(this, c5601nr3);
                                mn2 = mn3;
                                if (objD4 == mn2) {
                                    return mn2;
                                }
                                abstractC1121Hd9 = abstractC1121Hd8;
                                c5601nr0 = (C5601nr0) objD4;
                                abstractC1121Hd1 = abstractC1121Hd9;
                                a62 = a67;
                            }
                            string = "";
                            abstractC1121Hd7 = abstractC1121Hd7;
                            mn3 = mn3;
                            C5601nr0 c5601nr4 = new C5601nr0(a66, new Integer(Integer.parseInt(string)));
                            abstractC1121Hd8 = abstractC1121Hd6;
                            this.h = abstractC1121Hd8;
                            a67 = a65;
                            this.i = a67;
                            ?? r4 = th;
                            this.d = r4;
                            this.e = r4;
                            this.g = 3;
                            objD4 = abstractC1121Hd7.d(this, c5601nr4);
                            mn2 = mn3;
                            if (objD4 == mn2) {
                                return mn2;
                            }
                            abstractC1121Hd9 = abstractC1121Hd8;
                            c5601nr0 = (C5601nr0) objD4;
                            abstractC1121Hd1 = abstractC1121Hd9;
                            a62 = a67;
                        }
                    } else {
                        z = true;
                        mn = mn3;
                        if (Intrinsics.a(ri0, c2251Vp1.b(C1098Gw.class)) ? true : Intrinsics.a(ri0, c2251Vp1.b(AbstractC7769yA0.class))) {
                            this.h = abstractC1121Hd1;
                            this.i = a62;
                            this.d = abstractC1121Hd1;
                            this.e = a62;
                            this.g = 4;
                            objF = ((InterfaceC0942Ew) obj2).f(Long.MAX_VALUE, this);
                            if (objF == mn) {
                                return mn;
                            }
                            abstractC1121Hd4 = abstractC1121Hd1;
                            abstractC1121Hd5 = abstractC1121Hd4;
                            a64 = a62;
                            C5601nr0 c5601nr5 = new C5601nr0(a62, objF);
                            this.h = abstractC1121Hd5;
                            this.i = a64;
                            this.d = null;
                            this.e = null;
                            this.g = 5;
                            objD5 = abstractC1121Hd4.d(this, c5601nr5);
                            if (objD5 == mn) {
                                return mn;
                            }
                            abstractC1121Hd10 = abstractC1121Hd5;
                            c5601nr0 = (C5601nr0) objD5;
                            abstractC1121Hd1 = abstractC1121Hd10;
                            a62 = a64;
                        } else if (Intrinsics.a(ri0, c2251Vp1.b(byte[].class))) {
                            this.h = abstractC1121Hd1;
                            this.i = a62;
                            this.d = abstractC5391mr0D;
                            this.g = 6;
                            objK = MP0.k((InterfaceC0942Ew) obj2, this);
                            if (objK == mn) {
                                return mn;
                            }
                            abstractC1121Hd3 = abstractC1121Hd1;
                            a63 = a62;
                            bArr = (byte[]) objK;
                            Intrinsics.checkNotNullParameter(abstractC5391mr0D, "<this>");
                            InterfaceC2586Zn0 interfaceC2586Zn0A = abstractC5391mr0D.a();
                            List<String> list = C1159Hq0.a;
                            str2 = interfaceC2586Zn0A.get("Content-Length");
                            if (str2 != null) {
                                lValueOf = Long.valueOf(Long.parseLong(str2));
                            } else {
                                lValueOf = null;
                            }
                            boolean z5 = C1984Se1.a;
                            if (abstractC5391mr0D.a().get("Content-Encoding") == null) {
                                z3 = z;
                            } else {
                                z3 = false;
                            }
                            boolean zA = Intrinsics.a(((C2250Vp0) abstractC1121Hd3.d).c().G(), C1629Nq0.d);
                            if (z3 && !zA && lValueOf != null && lValueOf.longValue() > j) {
                                if (bArr.length == ((int) lValueOf.longValue())) {
                                    z4 = z;
                                } else {
                                    z4 = false;
                                }
                                if (!z4) {
                                    throw new IllegalStateException(("Expected " + lValueOf + ", actual " + bArr.length).toString());
                                }
                            }
                            C5601nr0 c5601nr6 = new C5601nr0(a63, bArr);
                            this.h = abstractC1121Hd3;
                            this.i = a63;
                            this.d = null;
                            this.g = 7;
                            objD6 = abstractC1121Hd3.d(this, c5601nr6);
                            if (objD6 == mn) {
                                return mn;
                            }
                            c5601nr0 = (C5601nr0) objD6;
                            abstractC1121Hd1 = abstractC1121Hd3;
                            a62 = a63;
                        } else if (Intrinsics.a(ri0, c2251Vp1.b(InterfaceC0942Ew.class))) {
                            C2684aG0 c2684aG0 = new C2684aG0((XF0) abstractC5391mr0D.getE().p(XF0.a.d));
                            C2665aA c2665aAA = SN.a(abstractC1121Hd1, abstractC5391mr0D.getE(), false, new a(obj2, abstractC5391mr0D, null));
                            c2665aAA.W(new b(c2684aG0));
                            C5601nr0 c5601nr7 = new C5601nr0(a62, c2665aAA.e);
                            this.h = abstractC1121Hd1;
                            this.i = a62;
                            this.g = 8;
                            objD2 = abstractC1121Hd1.d(this, c5601nr7);
                            if (objD2 == mn) {
                                return mn;
                            }
                            abstractC1121Hd2 = abstractC1121Hd1;
                            c5601nr0 = (C5601nr0) objD2;
                            abstractC1121Hd1 = abstractC1121Hd2;
                        } else if (Intrinsics.a(ri0, c2251Vp1.b(C0850Dr0.class))) {
                            InterfaceC0942Ew interfaceC0942Ew = (InterfaceC0942Ew) obj2;
                            Intrinsics.checkNotNullParameter(interfaceC0942Ew, "<this>");
                            interfaceC0942Ew.i(null);
                            C5601nr0 c5601nr8 = new C5601nr0(a62, abstractC5391mr0D.g());
                            this.h = abstractC1121Hd1;
                            this.i = a62;
                            this.g = 9;
                            objD = abstractC1121Hd1.d(this, c5601nr8);
                            if (objD == mn) {
                                return mn;
                            }
                            abstractC1121Hd2 = abstractC1121Hd1;
                            c5601nr0 = (C5601nr0) objD;
                            abstractC1121Hd1 = abstractC1121Hd2;
                        } else {
                            c5601nr0 = null;
                        }
                    }
                    if (c5601nr0 != null) {
                        C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                    }
                    return Unit.a;
                }
                InterfaceC0942Ew interfaceC0942Ew2 = (InterfaceC0942Ew) obj2;
                Intrinsics.checkNotNullParameter(interfaceC0942Ew2, "<this>");
                interfaceC0942Ew2.i(null);
                C5601nr0 c5601nr9 = new C5601nr0(a62, Unit.a);
                this.h = abstractC1121Hd1;
                this.i = a62;
                this.g = 1;
                objD3 = abstractC1121Hd1.d(this, c5601nr9);
                if (objD3 != mn3) {
                    abstractC1121Hd2 = abstractC1121Hd1;
                    c5601nr0 = (C5601nr0) objD3;
                    abstractC1121Hd1 = abstractC1121Hd2;
                    if (c5601nr0 != null) {
                        C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                    }
                    return Unit.a;
                }
                return mn3;
            case 1:
                A62 a68 = (A62) this.i;
                abstractC1121Hd2 = this.h;
                C1795Pt1.b(obj);
                a62 = a68;
                objD3 = obj;
                c5601nr0 = (C5601nr0) objD3;
                abstractC1121Hd1 = abstractC1121Hd2;
                if (c5601nr0 != null) {
                    C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                }
                return Unit.a;
            case 2:
                a66 = this.e;
                j = 0;
                abstractC1121Hd1 = (AbstractC1121Hd1) this.d;
                a65 = (A62) this.i;
                i = -1;
                AbstractC1121Hd1 abstractC1121Hd11 = this.h;
                C1795Pt1.b(obj);
                objF2 = obj;
                abstractC1121Hd6 = abstractC1121Hd11;
                i2 = 0;
                input = (AbstractC7769yA0) objF2;
                if (!input.q()) {
                    jU = input.u();
                    if (jU > j) {
                        abstractC1121Hd7 = abstractC1121Hd1;
                        if (Api.BaseClientBuilder.API_PRIORITY_OTHER >= jU) {
                            i39 = (int) jU;
                            Charset charset3 = Charsets.UTF_8;
                            Intrinsics.checkNotNullParameter(input, "<this>");
                            Intrinsics.checkNotNullParameter(charset3, "charset");
                            NewDecoder = charset3.newDecoder();
                            Intrinsics.checkNotNullExpressionValue(NewDecoder, "charset.newDecoder()");
                            CharBuffer charBuffer2 = C6927uA.a;
                            Intrinsics.checkNotNullParameter(NewDecoder, "<this>");
                            Intrinsics.checkNotNullParameter(input, "input");
                            if (i39 == 0) {
                                str = "buffer";
                                if (input.i - input.h >= i39) {
                                    th = null;
                                    charBufferAllocate = CharBuffer.allocate(i39);
                                    c2895bCL3 = C5189lv.l(input, 1);
                                    if (c2895bCL3 == null) {
                                        iPosition = i39;
                                        i40 = 1;
                                        mn3 = mn3;
                                        i46 = i2;
                                    } else {
                                        iPosition = i39;
                                        int i410 = 1;
                                        i40 = 1;
                                        r17 = i2;
                                        while (true) {
                                            i42 = c2895bCL3.c - c2895bCL3.b;
                                            if (i42 >= i47) {
                                                if (!charBufferAllocate.hasRemaining()) {
                                                    int i53 = iPosition;
                                                    r12 = r17 == true ? 1 : 0;
                                                    iPosition = i53;
                                                    i43 = i2;
                                                    r18 = r12;
                                                    i42 = c2895bCL3.c - c2895bCL3.b;
                                                    i47 = i43;
                                                } else {
                                                    int i54 = iPosition;
                                                    r12 = r17 == true ? 1 : 0;
                                                    iPosition = i54;
                                                    i43 = i2;
                                                    r18 = r12;
                                                    i42 = c2895bCL3.c - c2895bCL3.b;
                                                    i47 = i43;
                                                }
                                                if (c5601nr0 != null) {
                                                    C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                                                }
                                                return Unit.a;
                                            }
                                            str = str;
                                            mn3 = mn3;
                                            r18 = r17;
                                            if (i42 == 0) {
                                                c2895bCM2 = C5189lv.m(input, c2895bCL3);
                                                break;
                                            } else if (i42 >= i47) {
                                                C5189lv.f(input, c2895bCL3);
                                                c2895bCM2 = C5189lv.l(input, i47);
                                            } else {
                                                C5189lv.f(input, c2895bCL3);
                                                c2895bCM2 = C5189lv.l(input, i47);
                                            }
                                            if (c2895bCM2 == null) {
                                                i45 = i2;
                                            } else {
                                                c2895bCL3 = c2895bCM2;
                                                if (i47 <= 0) {
                                                    i45 = i40;
                                                } else {
                                                    str = str;
                                                    mn3 = mn3;
                                                    i40 = 1;
                                                    r17 = r18;
                                                }
                                            }
                                        }
                                        if (i45 != 0) {
                                            C5189lv.f(input, c2895bCL3);
                                        }
                                        i46 = r18 == true ? 1 : 0;
                                    }
                                    if (charBufferAllocate.hasRemaining()) {
                                        rc = NewDecoder.decode(C6927uA.b, charBufferAllocate, i40);
                                        if (rc.isMalformed()) {
                                            Intrinsics.checkNotNullExpressionValue(rc, "rc");
                                            C6927uA.e(rc);
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(rc, "rc");
                                            C6927uA.e(rc);
                                        }
                                    }
                                    if (iPosition <= 0) {
                                        throw new EOFException("Not enough bytes available: had only " + (i39 - iPosition) + " instead of " + i39);
                                    }
                                    if (iPosition >= 0) {
                                        throw new AssertionError("remainingInputBytes < 0");
                                    }
                                    charBufferAllocate.flip();
                                    string = charBufferAllocate.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "cb.toString()");
                                    abstractC1121Hd6 = abstractC1121Hd6;
                                    a65 = a65;
                                } else if (input.g.hasArray()) {
                                    ByteBuffer byteBuffer9 = input.g;
                                    byte[] bArrArray2 = byteBuffer9.array();
                                    Intrinsics.checkNotNullExpressionValue(bArrArray2, "bb.array()");
                                    int iPosition4 = byteBuffer9.position() + byteBuffer9.arrayOffset() + input.t().b;
                                    Charset charset4 = NewDecoder.charset();
                                    Intrinsics.checkNotNullExpressionValue(charset4, "charset()");
                                    String str4 = new String(bArrArray2, iPosition4, i39, charset4);
                                    input.c(i39);
                                    abstractC1121Hd7 = abstractC1121Hd7;
                                    string = str4;
                                } else {
                                    CharBuffer charBufferAllocate3 = CharBuffer.allocate(i39);
                                    ByteBuffer byteBuffer10 = input.g;
                                    int i55 = input.t().b;
                                    ByteBuffer byteBuffer11 = WY0.a;
                                    ByteBuffer buffer2 = C6621sj.p(byteBuffer10, i55, i39);
                                    Intrinsics.checkNotNullParameter(buffer2, "buffer");
                                    rc2 = NewDecoder.decode(buffer2, charBufferAllocate3, true);
                                    if (rc2.isMalformed()) {
                                        Intrinsics.checkNotNullExpressionValue(rc2, "rc");
                                        C6927uA.e(rc2);
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(rc2, "rc");
                                        C6927uA.e(rc2);
                                    }
                                    charBufferAllocate3.flip();
                                    input.c(buffer2.position());
                                    string = charBufferAllocate3.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "cb.toString()");
                                    abstractC1121Hd7 = abstractC1121Hd7;
                                }
                            }
                            mn3 = mn3;
                        } else {
                            abstractC1121Hd7 = abstractC1121Hd7;
                        }
                        C5601nr0 c5601nr10 = new C5601nr0(a66, new Integer(Integer.parseInt(string)));
                        abstractC1121Hd8 = abstractC1121Hd6;
                        this.h = abstractC1121Hd8;
                        a67 = a65;
                        this.i = a67;
                        ?? r5 = th;
                        this.d = r5;
                        this.e = r5;
                        this.g = 3;
                        objD4 = abstractC1121Hd7.d(this, c5601nr10);
                        mn2 = mn3;
                        if (objD4 == mn2) {
                            return mn2;
                        }
                        abstractC1121Hd9 = abstractC1121Hd8;
                        c5601nr0 = (C5601nr0) objD4;
                        abstractC1121Hd1 = abstractC1121Hd9;
                        a62 = a67;
                        if (c5601nr0 != null) {
                            C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                        }
                        return Unit.a;
                    }
                    abstractC1121Hd7 = abstractC1121Hd1;
                    th = null;
                    mn3 = mn3;
                    sb = new StringBuilder(16);
                    if (input.q()) {
                        abstractC1121Hd6 = abstractC1121Hd6;
                        a65 = a65;
                    } else {
                        c2895bCL = C5189lv.l(input, 1);
                        if (c2895bCL == null) {
                            i3 = i2;
                            i4 = i3;
                        } else {
                            i3 = i2;
                            i4 = i3;
                            while (true) {
                                byteBuffer = c2895bCL.a;
                                i5 = c2895bCL.b;
                                i6 = c2895bCL.c;
                                i7 = i5;
                                while (true) {
                                    if (i7 < i6) {
                                        b2 = byteBuffer.get(i7);
                                        i11 = b2 & 255;
                                        i8 = i4;
                                        if ((b2 & 128) != 128) {
                                            c = (char) i11;
                                            if (i3 == Integer.MAX_VALUE) {
                                                i12 = i2;
                                            } else {
                                                sb.append(c);
                                                i3++;
                                                i12 = 1;
                                            }
                                            if (i12 == 0) {
                                                i7++;
                                                i4 = i8;
                                            }
                                        }
                                        c2895bCL.c(i7 - i5);
                                        i9 = i2;
                                    } else {
                                        i8 = i4;
                                        c2895bCL.c(i6 - i5);
                                        i9 = 1;
                                    }
                                    if (i9 != 0) {
                                        i4 = i8;
                                        i10 = 1;
                                    } else if (i3 == Integer.MAX_VALUE) {
                                        i4 = i8;
                                        i10 = i2;
                                    } else {
                                        i10 = i2;
                                        i4 = 1;
                                    }
                                    if (i10 == 0) {
                                        C5189lv.f(input, c2895bCL);
                                    } else {
                                        c2895bCL = C5189lv.m(input, c2895bCL);
                                        if (c2895bCL == null) {
                                            i2 = 0;
                                            th = null;
                                        }
                                    }
                                }
                            }
                        }
                        if (i4 != 0) {
                            i13 = 0 - i3;
                            i14 = Api.BaseClientBuilder.API_PRIORITY_OTHER - i3;
                            c2895bCL2 = C5189lv.l(input, 1);
                            if (c2895bCL2 == null) {
                                abstractC1121Hd6 = abstractC1121Hd6;
                                a65 = a65;
                                i24 = i2;
                            } else {
                                i15 = i2;
                                i16 = 1;
                                while (true) {
                                    i19 = c2895bCL2.c;
                                    i20 = c2895bCL2.b;
                                    i21 = i15;
                                    i22 = i19 - i20;
                                    if (i22 >= i16) {
                                        byteBuffer2 = c2895bCL2.a;
                                        i23 = i20;
                                        i24 = i21;
                                        i25 = i2;
                                        i26 = i25;
                                        i27 = i26;
                                        while (true) {
                                            if (i23 < i19) {
                                                i28 = i19;
                                                b3 = byteBuffer2.get(i23);
                                                i29 = i23;
                                                i30 = b3 & 255;
                                                abstractC1121Hd6 = abstractC1121Hd6;
                                                byteBuffer3 = byteBuffer2;
                                                if ((b3 & 128) == 0) {
                                                    if (i25 == 0) {
                                                        i35 = 128;
                                                        while (i36 < 7) {
                                                            i30 &= ~i35;
                                                            i35 >>= 1;
                                                            i25++;
                                                        }
                                                        i37 = i25 - 1;
                                                        if (i25 > i28 - i29) {
                                                            c2895bCL2.c(i29 - i23);
                                                            i17 = 1;
                                                        } else {
                                                            i26 = i30;
                                                            i27 = i25;
                                                            i25 = i37;
                                                        }
                                                    } else {
                                                        i31 = (i26 << 6) | (b3 & 127);
                                                        i25--;
                                                        if (i25 == 0) {
                                                            i26 = i31;
                                                        } else if ((i31 >>> 16) == 0) {
                                                            c4 = (char) i31;
                                                            if (i24 == i14) {
                                                                i34 = i2;
                                                            } else {
                                                                sb.append(c4);
                                                                i24++;
                                                                i34 = 1;
                                                            }
                                                            if (i34 == 0) {
                                                                c2895bCL2.c(((i29 - i23) - i27) + 1);
                                                                i25 = i;
                                                                i17 = 1;
                                                            } else {
                                                                i26 = i2;
                                                            }
                                                        } else {
                                                            if (i31 <= 1114111) {
                                                                ED.l(i31);
                                                                throw th;
                                                            }
                                                            c2 = (char) ((i31 >>> 10) + 55232);
                                                            if (i24 == i14) {
                                                                i32 = i2;
                                                            } else {
                                                                sb.append(c2);
                                                                i24++;
                                                                i32 = 1;
                                                            }
                                                            if (i32 != 0) {
                                                                c3 = (char) ((i31 & 1023) + 56320);
                                                                if (i24 == i14) {
                                                                    i33 = i2;
                                                                } else {
                                                                    sb.append(c3);
                                                                    i24++;
                                                                    i33 = 1;
                                                                }
                                                                if (i33 == 0) {
                                                                }
                                                                i26 = i2;
                                                            }
                                                            c2895bCL2.c(((i29 - i23) - i27) + 1);
                                                            i25 = i;
                                                            i17 = 1;
                                                        }
                                                    }
                                                    i23 = i29 + 1;
                                                    abstractC1121Hd6 = abstractC1121Hd6;
                                                    i19 = i28;
                                                    byteBuffer2 = byteBuffer3;
                                                } else {
                                                    if (i25 == 0) {
                                                        throw new C3794fW0("Expected " + i25 + " more character bytes");
                                                    }
                                                    c5 = (char) i30;
                                                    if (i24 == i14) {
                                                        i38 = i2;
                                                    } else {
                                                        sb.append(c5);
                                                        i24++;
                                                        i38 = 1;
                                                    }
                                                    if (i38 == 0) {
                                                        c2895bCL2.c(i29 - i23);
                                                        i25 = i;
                                                        i17 = 1;
                                                    } else {
                                                        i23 = i29 + 1;
                                                        abstractC1121Hd6 = abstractC1121Hd6;
                                                        i19 = i28;
                                                        byteBuffer2 = byteBuffer3;
                                                    }
                                                }
                                            } else {
                                                abstractC1121Hd6 = abstractC1121Hd6;
                                                i17 = 1;
                                                c2895bCL2.c(i22);
                                                i25 = i2;
                                            }
                                            if (i25 == 0) {
                                                i25 = i17;
                                            } else if (i25 <= 0) {
                                                i25 = i2;
                                            }
                                            i22 = c2895bCL2.c - c2895bCL2.b;
                                            i16 = i25;
                                        }
                                    } else {
                                        abstractC1121Hd6 = abstractC1121Hd6;
                                        i17 = 1;
                                        i24 = i21;
                                    }
                                    if (i22 == 0) {
                                        c2895bCM = C5189lv.m(input, c2895bCL2);
                                        break;
                                    } else if (i22 >= i16) {
                                        C5189lv.f(input, c2895bCL2);
                                        c2895bCM = C5189lv.l(input, i16);
                                    } else {
                                        C5189lv.f(input, c2895bCL2);
                                        c2895bCM = C5189lv.l(input, i16);
                                    }
                                    if (c2895bCM == null) {
                                        c2895bCL2 = c2895bCM;
                                        if (i16 <= 0) {
                                            i2 = i17;
                                        } else {
                                            i15 = i24;
                                            abstractC1121Hd6 = abstractC1121Hd6;
                                            a65 = a65;
                                        }
                                    }
                                }
                                if (i2 != 0) {
                                    C5189lv.f(input, c2895bCL2);
                                }
                            }
                            if (i24 < i13) {
                                throw new C3794fW0(C4564j.c(i13, i24, "Premature end of stream: expected at least ", " chars but had only "));
                            }
                        } else {
                            abstractC1121Hd6 = abstractC1121Hd6;
                            a65 = a65;
                            if (i3 < 0) {
                                throw new C3794fW0(C4564j.c(i2, i3, "Premature end of stream: expected at least ", " chars but had only "));
                            }
                        }
                    }
                    string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
                    C5601nr0 c5601nr11 = new C5601nr0(a66, new Integer(Integer.parseInt(string)));
                    abstractC1121Hd8 = abstractC1121Hd6;
                    this.h = abstractC1121Hd8;
                    a67 = a65;
                    this.i = a67;
                    ?? r6 = th;
                    this.d = r6;
                    this.e = r6;
                    this.g = 3;
                    objD4 = abstractC1121Hd7.d(this, c5601nr11);
                    mn2 = mn3;
                    if (objD4 == mn2) {
                        return mn2;
                    }
                    abstractC1121Hd9 = abstractC1121Hd8;
                    c5601nr0 = (C5601nr0) objD4;
                    abstractC1121Hd1 = abstractC1121Hd9;
                    a62 = a67;
                    if (c5601nr0 != null) {
                        C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                    }
                    return Unit.a;
                }
                abstractC1121Hd7 = abstractC1121Hd1;
                string = "";
                abstractC1121Hd7 = abstractC1121Hd7;
                mn3 = mn3;
                C5601nr0 c5601nr12 = new C5601nr0(a66, new Integer(Integer.parseInt(string)));
                abstractC1121Hd8 = abstractC1121Hd6;
                this.h = abstractC1121Hd8;
                a67 = a65;
                this.i = a67;
                ?? r8 = th;
                this.d = r8;
                this.e = r8;
                this.g = 3;
                objD4 = abstractC1121Hd7.d(this, c5601nr12);
                mn2 = mn3;
                if (objD4 == mn2) {
                    return mn2;
                }
                abstractC1121Hd9 = abstractC1121Hd8;
                c5601nr0 = (C5601nr0) objD4;
                abstractC1121Hd1 = abstractC1121Hd9;
                a62 = a67;
                if (c5601nr0 != null) {
                    C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                }
                return Unit.a;
            case 3:
                A62 a69 = (A62) this.i;
                abstractC1121Hd9 = this.h;
                C1795Pt1.b(obj);
                a67 = a69;
                objD4 = obj;
                c5601nr0 = (C5601nr0) objD4;
                abstractC1121Hd1 = abstractC1121Hd9;
                a62 = a67;
                if (c5601nr0 != null) {
                    C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                }
                return Unit.a;
            case 4:
                A62 a610 = this.e;
                abstractC1121Hd4 = (AbstractC1121Hd1) this.d;
                a64 = (A62) this.i;
                abstractC1121Hd5 = this.h;
                C1795Pt1.b(obj);
                a62 = a610;
                mn = mn3;
                objF = obj;
                C5601nr0 c5601nr13 = new C5601nr0(a62, objF);
                this.h = abstractC1121Hd5;
                this.i = a64;
                this.d = null;
                this.e = null;
                this.g = 5;
                objD5 = abstractC1121Hd4.d(this, c5601nr13);
                if (objD5 == mn) {
                    return mn;
                }
                abstractC1121Hd10 = abstractC1121Hd5;
                c5601nr0 = (C5601nr0) objD5;
                abstractC1121Hd1 = abstractC1121Hd10;
                a62 = a64;
                if (c5601nr0 != null) {
                    C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                }
                return Unit.a;
            case 5:
                A62 a611 = (A62) this.i;
                abstractC1121Hd10 = this.h;
                C1795Pt1.b(obj);
                a64 = a611;
                objD5 = obj;
                c5601nr0 = (C5601nr0) objD5;
                abstractC1121Hd1 = abstractC1121Hd10;
                a62 = a64;
                if (c5601nr0 != null) {
                    C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                }
                return Unit.a;
            case 6:
                AbstractC5391mr0 abstractC5391mr0 = (AbstractC5391mr0) this.d;
                a63 = (A62) this.i;
                AbstractC1121Hd1 abstractC1121Hd12 = this.h;
                C1795Pt1.b(obj);
                abstractC5391mr0D = abstractC5391mr0;
                abstractC1121Hd3 = abstractC1121Hd12;
                z = true;
                mn = mn3;
                j = 0;
                objK = obj;
                bArr = (byte[]) objK;
                Intrinsics.checkNotNullParameter(abstractC5391mr0D, "<this>");
                InterfaceC2586Zn0 interfaceC2586Zn0A2 = abstractC5391mr0D.a();
                List<String> list2 = C1159Hq0.a;
                str2 = interfaceC2586Zn0A2.get("Content-Length");
                if (str2 != null) {
                    lValueOf = Long.valueOf(Long.parseLong(str2));
                } else {
                    lValueOf = null;
                }
                boolean z6 = C1984Se1.a;
                if (abstractC5391mr0D.a().get("Content-Encoding") == null) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                boolean zA2 = Intrinsics.a(((C2250Vp0) abstractC1121Hd3.d).c().G(), C1629Nq0.d);
                if (z3) {
                    if (bArr.length == ((int) lValueOf.longValue())) {
                        z4 = z;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalStateException(("Expected " + lValueOf + ", actual " + bArr.length).toString());
                    }
                }
                C5601nr0 c5601nr14 = new C5601nr0(a63, bArr);
                this.h = abstractC1121Hd3;
                this.i = a63;
                this.d = null;
                this.g = 7;
                objD6 = abstractC1121Hd3.d(this, c5601nr14);
                if (objD6 == mn) {
                    return mn;
                }
                c5601nr0 = (C5601nr0) objD6;
                abstractC1121Hd1 = abstractC1121Hd3;
                a62 = a63;
                if (c5601nr0 != null) {
                    C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                }
                return Unit.a;
            case 7:
                A62 a612 = (A62) this.i;
                abstractC1121Hd3 = this.h;
                C1795Pt1.b(obj);
                a63 = a612;
                objD6 = obj;
                c5601nr0 = (C5601nr0) objD6;
                abstractC1121Hd1 = abstractC1121Hd3;
                a62 = a63;
                if (c5601nr0 != null) {
                    C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                }
                return Unit.a;
            case 8:
                A62 a613 = (A62) this.i;
                abstractC1121Hd2 = this.h;
                C1795Pt1.b(obj);
                a62 = a613;
                objD2 = obj;
                c5601nr0 = (C5601nr0) objD2;
                abstractC1121Hd1 = abstractC1121Hd2;
                if (c5601nr0 != null) {
                    C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                }
                return Unit.a;
            case 9:
                A62 a614 = (A62) this.i;
                abstractC1121Hd2 = this.h;
                C1795Pt1.b(obj);
                a62 = a614;
                objD = obj;
                c5601nr0 = (C5601nr0) objD;
                abstractC1121Hd1 = abstractC1121Hd2;
                if (c5601nr0 != null) {
                    C5524nW.a.c("Transformed with default transformers response body for " + ((C2250Vp0) abstractC1121Hd1.d).c().getUrl() + " to " + a62.a);
                }
                return Unit.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC1121Hd1<C5601nr0, C2250Vp0> abstractC1121Hd1, C5601nr0 c5601nr0, JM<? super Unit> jm) {
        C5314mW c5314mW = new C5314mW(3, jm);
        c5314mW.h = abstractC1121Hd1;
        c5314mW.i = c5601nr0;
        return c5314mW.invokeSuspend(Unit.a);
    }
}
