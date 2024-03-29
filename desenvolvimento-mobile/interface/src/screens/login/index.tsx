import { View, Text, ImageBackground, StyleSheet } from 'react-native';
import { Input, Button } from 'react-native-elements'
import bg from './../../assets/imgs/background.png';

export interface LoginScreenProps {
}

export function LoginScreen(props: LoginScreenProps) {
  return (
    <ImageBackground source={bg} style={styles.background}>
      <View style={styles.container}>

        <Text style={styles.logo}>APP</Text>

        <Input placeholder='Digite seu e-mail'
          leftIcon={{ name: 'person', color: 'white' }}
          inputContainerStyle={styles.containerInput}
          inputStyle={{ color: 'white' }} />

        <Input placeholder='Digite sua senha'
          leftIcon={{ name: 'lock', color: 'white' }}
          inputContainerStyle={styles.containerInput}
          inputStyle={{ color: 'white' }}
          secureTextEntry={true} />

        <Button title='Logar'
          containerStyle={{ borderRadius: 30 }}
          raised={true} />

        <Text style={styles.cadastrar}>
          Não possui conta? Clique aqui para se cadastrar
        </Text>
      </View>
    </ImageBackground>
  );
}

const styles = StyleSheet.create({
  background: { width: '100%', height: '100%' },

  container: {
    flex: 1,
    justifyContent: 'center',
    padding: 10,
    alignItems: 'stretch'
  },

  logo: { color: 'white', fontSize: 50, textAlign: 'center' },

  containerInput: {
    backgroundColor: 'rgba(255,255,255,0.3)',
    borderRadius: 30,
    padding: 5,
    marginBottom: 5,
  },

  cadastrar: {
    color: 'white',
    fontSize: 20,
    textDecorationLine: 'underline',
    margin: 30,
    textAlign: 'center'
  }
});
