# test
プログラムの説明

湊君がスッキリJava入門で全然作らなかったRPGの戦闘部分だけを作成。

mainフォルダで戦闘させる組み合わせを編集して使う。

player側とenemy側でプログラムが少し違う。

共通点があるシステムは、
・クリティカルの判定がある。
・出る技がランダム抽選（小、中、大、バイキルト(player)orヒール（enemy））
・ダメージは 攻撃 - 防御

player側だけのシステムは
・装備をしていてその分ステータスが上がっている。
・バイキルトが抽選にある


enemy側だけのシステムは
・キャラ事に強さのランクがある（レア、弱、中、強）
・強さ毎にステータスと技の抽選確率が変わっている（一部キャラはそもそも強技がなかったり、デフォルト攻撃しかない）
・レアと弱の強さのキャラに逃げるが実装されている
・一部の強さのキャラが技を一定確率で外す
・強ランクのキャラが一定HP以下で攻撃力2倍、防御0になる
